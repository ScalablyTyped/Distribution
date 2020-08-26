package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeElement
  extends typings.senchaTouch.Ext.dom.ICompositeElementLite {
  /** [Method] fixes scope with flyweight
    * @param eventName Object
    * @param handler Object
    * @param scope Object
    * @param opt Object
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("addListener")
  var addListener_ICompositeElement: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @param root HTMLElement/String The root element of the query or id of the root.
    * @returns Ext.dom.CompositeElementLite This Composite object.
    */
  @JSName("add")
  var add_ICompositeElement: js.UndefOr[
    js.Function2[
      /* els */ js.UndefOr[js.Any], 
      /* root */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("each")
  var each_ICompositeElement: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("fill")
  var fill_ICompositeElement: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.ICompositeElementLite]
  ] = js.native
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("filter")
  var filter_ICompositeElement: js.UndefOr[
    js.Function1[
      /* selector */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean true to also remove the element from the document
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("removeElement")
  var removeElement_ICompositeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean true to remove and replace the element in the document too.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("replaceElement")
  var replaceElement_ICompositeElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
    * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
    */
  @JSName("select")
  var select_ICompositeElement: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* composite */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
}

object ICompositeElement {
  @scala.inline
  def apply(): ICompositeElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElement]
  }
  @scala.inline
  implicit class ICompositeElementOps[Self <: ICompositeElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(
      value: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = this.set("addListener", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAddListener: Self = this.set("addListener", js.undefined)
    @scala.inline
    def setEach(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = this.set("each", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setFill(value: /* els */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = this.set("fill", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFilter(value: /* selector */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setRemoveElement(
      value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = this.set("removeElement", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveElement: Self = this.set("removeElement", js.undefined)
    @scala.inline
    def setReplaceElement(
      value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = this.set("replaceElement", js.Any.fromFunction3(value))
    @scala.inline
    def deleteReplaceElement: Self = this.set("replaceElement", js.undefined)
    @scala.inline
    def setSelect(
      value: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = this.set("select", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

