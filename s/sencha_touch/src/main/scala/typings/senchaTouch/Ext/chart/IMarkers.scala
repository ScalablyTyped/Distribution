package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.draw.sprite.IInstancing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMarkers extends IInstancing {
  
  /** [Method] Clear the markers in the category
    * @param category String
    */
  var clear: js.UndefOr[js.Function1[/* category */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method]
    * @param category String
    * @param index Mixed
    * @param isWithoutTransform Boolean
    */
  var getMarkerBBoxFor: js.UndefOr[
    js.Function3[
      /* category */ js.UndefOr[String], 
      /* index */ js.UndefOr[js.Any], 
      /* isWithoutTransform */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Put a marker in the category with additional attributes
    * @param category String
    * @param markerAttr Object
    * @param index String|Number
    * @param canonical Boolean
    * @param keepRevision Boolean
    */
  var putMarkerFor: js.UndefOr[
    js.Function5[
      /* category */ js.UndefOr[String], 
      /* markerAttr */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[js.Any], 
      /* canonical */ js.UndefOr[Boolean], 
      /* keepRevision */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @param clipRegion Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IMarkers: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
}
object IMarkers {
  
  @scala.inline
  def apply(): IMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkers]
  }
  
  @scala.inline
  implicit class IMarkersOps[Self <: IMarkers] (val x: Self) extends AnyVal {
    
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
    def setClear(value: /* category */ js.UndefOr[String] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setGetMarkerBBoxFor(
      value: (/* category */ js.UndefOr[String], /* index */ js.UndefOr[js.Any], /* isWithoutTransform */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("getMarkerBBoxFor", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetMarkerBBoxFor: Self = this.set("getMarkerBBoxFor", js.undefined)
    
    @scala.inline
    def setPutMarkerFor(
      value: (/* category */ js.UndefOr[String], /* markerAttr */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], /* canonical */ js.UndefOr[Boolean], /* keepRevision */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("putMarkerFor", js.Any.fromFunction5(value))
    
    @scala.inline
    def deletePutMarkerFor: Self = this.set("putMarkerFor", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
