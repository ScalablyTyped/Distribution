package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsUtil extends js.Object {
  /**
    * Set the property of an object for a given key. If something already
    * exists there, then it becomes an array containing both the old and new value.
    * @param obj - object on which to set the property
    * @param key - property name
    * @param value - the value of the property to be set
    * @param ensureArray - ensure that the property remains an array
    * @param index - add the new item in a certain array position
    */
  def arrayishAdd(obj: js.Any, key: java.lang.String, value: js.Any): scala.Unit = js.native
  def arrayishAdd(obj: js.Any, key: java.lang.String, value: js.Any, ensureArray: scala.Boolean): scala.Unit = js.native
  def arrayishAdd(obj: js.Any, key: java.lang.String, value: js.Any, ensureArray: scala.Boolean, index: scala.Double): scala.Unit = js.native
  /**
    * Removes an item from an object at a given key. If the key points to an array,
    * then the item is just removed from the array.
    * @param obj - object on which to remove the property
    * @param key - property name
    * @param value - the value of the property to be removed
    * @param ensureArray - ensure that the property remains an array
    */
  def arrayishRemove(obj: js.Any, key: java.lang.String, value: js.Any): scala.Unit = js.native
  def arrayishRemove(obj: js.Any, key: java.lang.String, value: js.Any, ensureArray: scala.Boolean): scala.Unit = js.native
  /**
    * With this function we avoid that the internal Tag methods get overridden
    * @param data - options we want to use to extend the tag instance
    * @returns Clean object without containing the riot internal reserved words
    */
  def cleanUpData(data: js.Any): js.Any = js.native
  /**
    * Loop backward all the parents tree to detect the first custom parent tag
    * @param tag - a tag instance
    * @returns Instance of the first custom parent tag found
    */
  def getImmediateCustomParentTag(tag: TagInstance): TagInstance = js.native
  /**
    * Detect the tag implementation by a DOM node
    * @param element - DOM node we need to parse to get its tag implementation
    * @returns Object containing the implementation of a custom tag (template and boot function)
    */
  def getTag(element: stdLib.Element): js.Any = js.native
  /**
    * Get the tag name of any DOM node
    * @param dom - DOM node we want to parse
    * @param skipDataIs - hack to ignore the data-is attribute when attaching to parent
    * @returns Name to identify this dom node in riot
    */
  def getTagName(dom: stdLib.Element, skipDataIs: scala.Boolean): java.lang.String = js.native
  /**
    * Inherit properties from a target tag instance
    * @param target - tag where we will inherit properties
    * @param propsInSyncWithParent - array of properties to sync with the target
    */
  def inheritFrom(`this`: TagInstance, target: TagInstance, propsInSyncWithParent: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Create a new child tag including it correctly into its parent
    * @param child - child tag implementation
    * @param opts - tag options containing the DOM node where the tag will be mounted
    * @param innerHTML - inner html of the child node
    * @param parent - instance of the parent tag including the child custom tag
    * @returns Instance of the new child tag just created
    */
  def initChildTag(child: js.Any, opts: js.Any, innerHTML: java.lang.String, parent: TagInstance): TagInstance = js.native
  /**
    * Makes a tag virtual and replaces a reference in the dom
    * @param tag - tag to make virtual
    * @param ref - dom reference location
    */
  def makeReplaceVirtual(tag: TagInstance, ref: stdLib.Node): scala.Unit = js.native
  /**
    * Adds the elements for a virtual tag
    * @param src - the node that will do the inserting or appending
    * @param target - only if inserting, insert before this tag's first child
    */
  def makeVirtual(`this`: TagInstance, src: stdLib.Node): scala.Unit = js.native
  def makeVirtual(`this`: TagInstance, src: stdLib.Node, target: TagInstance): scala.Unit = js.native
  /**
    * Mount a tag creating new Tag instance
    * @param root - dom node where the tag will be mounted
    * @param tagName - name of the riot tag we want to mount
    * @param opts - options to pass to the Tag instance
    * @param ctx - optional context that will be used to extend an existing class ( used in riot.Tag )
    * @returns Created tag instance
    */
  def mountTo(root: stdLib.Element, tagName: java.lang.String): TagInstance = js.native
  def mountTo(root: stdLib.Element, tagName: java.lang.String, opts: TagOpts): TagInstance = js.native
  def mountTo(root: stdLib.Element, tagName: java.lang.String, opts: TagOpts, ctx: js.Any): TagInstance = js.native
  /**
    * Move the position of a custom tag in its parent tag
    * @param tagName - key where the tag was stored
    * @param newPos - index where the new tag will be stored
    */
  def moveChildTag(`this`: TagInstance, tagName: java.lang.String, newPos: scala.Double): scala.Unit = js.native
  /**
    * Move virtual tag and all child nodes
    * @param src  - the node that will do the inserting
    * @param target - insert before this tag's first child
    */
  def moveVirtual(`this`: TagInstance, src: stdLib.Node, target: TagInstance): scala.Unit = js.native
  /**
    * Get selectors for tags
    * @param tags - tag names to select
    * @returns Selector
    */
  def selectTags(tags: js.Array[java.lang.String]): java.lang.String = js.native
  /**
    * Trigger the unmount method on all the expressions
    * @param expressions - DOM expressions
    */
  def unmountAll(expressions: js.Array[_]): scala.Unit = js.native
}

