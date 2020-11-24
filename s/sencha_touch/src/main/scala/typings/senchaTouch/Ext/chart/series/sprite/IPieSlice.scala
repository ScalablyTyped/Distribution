package typings.senchaTouch.Ext.chart.series.sprite

import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.sprite.ISector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IPieSlice extends ISector {
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var doCallout: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of rendererIndex
    * @returns Number
    */
  var getRendererIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (String) */
  var label: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  
  /** [Method] Render method
    * @param ctx Object
    * @param surface Object
    * @param clipRegion Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IPieSlice: js.UndefOr[
    js.Function3[
      /* ctx */ js.UndefOr[js.Any], 
      /* surface */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var rotateLabels: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of rendererIndex
    * @param rendererIndex Number The new value.
    */
  var setRendererIndex: js.UndefOr[js.Function1[/* rendererIndex */ js.UndefOr[Double], Unit]] = js.native
}
object IPieSlice {
  
  @scala.inline
  def apply(): IPieSlice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieSlice]
  }
  
  @scala.inline
  implicit class IPieSliceOps[Self <: IPieSlice] (val x: Self) extends AnyVal {
    
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
    def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = this.set("bindMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBindMarker: Self = this.set("bindMarker", js.undefined)
    
    @scala.inline
    def setDoCallout(value: Boolean): Self = this.set("doCallout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoCallout: Self = this.set("doCallout", js.undefined)
    
    @scala.inline
    def setGetRendererIndex(value: () => Double): Self = this.set("getRendererIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRendererIndex: Self = this.set("getRendererIndex", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelOverflowPadding(value: Double): Self = this.set("labelOverflowPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOverflowPadding: Self = this.set("labelOverflowPadding", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* ctx */ js.UndefOr[js.Any], /* surface */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRotateLabels(value: Boolean): Self = this.set("rotateLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateLabels: Self = this.set("rotateLabels", js.undefined)
    
    @scala.inline
    def setSetRendererIndex(value: /* rendererIndex */ js.UndefOr[Double] => Unit): Self = this.set("setRendererIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRendererIndex: Self = this.set("setRendererIndex", js.undefined)
  }
}
