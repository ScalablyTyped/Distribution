package typings.senchaTouch.Ext.event

import typings.senchaTouch.Ext.Array
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDom extends js.Object {
  
  /** [Property] (Number) */
  var distance: js.UndefOr[Double] = js.native
  
  /** [Method] Gets the x coordinate of the event
    * @returns Number
    */
  var getPageX: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Gets the y coordinate of the event
    * @returns Number
    */
  var getPageY: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Gets the target for the event
    * @param selector String A simple selector to filter the target or look for an ancestor of the target
    * @param maxDepth Number/Mixed The max depth to search as a number or element (defaults to 10 || document.body)
    * @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
    * @returns HTMLElement
    */
  var getTarget: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.native
  
  /** [Method] Returns the time of the event
    * @returns Date
    */
  var getTime: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Gets the X and Y coordinates of the event
    * @returns Array
    */
  var getXY: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Property] (Number) */
  var pageX: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var pageY: js.UndefOr[Double] = js.native
  
  /** [Method] Prevents the browsers default handling of the event  */
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (HTMLElement) */
  var target: js.UndefOr[HTMLElement] = js.native
}
object IDom {
  
  @scala.inline
  def apply(): IDom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDom]
  }
  
  @scala.inline
  implicit class IDomOps[Self <: IDom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setGetPageX(value: () => Double): Self = this.set("getPageX", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPageX: Self = this.set("getPageX", js.undefined)
    
    @scala.inline
    def setGetPageY(value: () => Double): Self = this.set("getPageY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPageY: Self = this.set("getPageY", js.undefined)
    
    @scala.inline
    def setGetTarget(
      value: (/* selector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
    ): Self = this.set("getTarget", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetTarget: Self = this.set("getTarget", js.undefined)
    
    @scala.inline
    def setGetTime(value: () => _): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTime: Self = this.set("getTime", js.undefined)
    
    @scala.inline
    def setGetXY(value: () => Array): Self = this.set("getXY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXY: Self = this.set("getXY", js.undefined)
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
