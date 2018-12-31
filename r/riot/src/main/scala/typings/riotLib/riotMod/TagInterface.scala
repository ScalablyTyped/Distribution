package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagInterface extends Observable {
  /**
    * Is tag instance mounted
    */
  var isMounted: js.UndefOr[scala.Boolean] = js.native
  /**
    * Tag instance options
    */
  var opts: TagOpts = js.native
  /**
    * the parent tag if any
    */
  var parent: js.UndefOr[TagInstance] = js.native
  /**
    * References to tags or DOM elements
    */
  var refs: TagRefs = js.native
  /**
    * root DOM node
    */
  var root: stdLib.Element = js.native
  /**
    * nested custom tags
    */
  var tags: NestedTags = js.native
  /**
    * Extend tag with functionality available on shared mixin registered with `riot.mixin(mixinName, mixinObject)`
    * or extend tag functionality with functionality available on provided mixin object.
    * @param mixin Name of shared mixin or mixin object
    */
  def mixin(mixin: java.lang.String): scala.Unit = js.native
  def mixin(mixin: TagMixin): scala.Unit = js.native
  /**
    * Mount the tag
    */
  def mount(): scala.Unit = js.native
  /**
    * Detach the tag and its children from the page.
    * @param keepTheParent If `true` unmounting tag doesn't remove the parent tag
    */
  def unmount(): scala.Unit = js.native
  def unmount(keepTheParent: scala.Boolean): scala.Unit = js.native
  /**
    * Updates all the expressions on the current tag instance as well as on all the children.
    * @param data Context data
    */
  def update(): scala.Unit = js.native
  def update(data: js.Any): scala.Unit = js.native
}

