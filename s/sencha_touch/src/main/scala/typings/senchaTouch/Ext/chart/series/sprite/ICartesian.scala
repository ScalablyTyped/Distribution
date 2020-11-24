package typings.senchaTouch.Ext.chart.series.sprite

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.ISurface
import typings.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait ICartesian extends ISprite {
  
  /** [Config Option] (Array) */
  var Data: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var If: js.UndefOr[Boolean] = js.native
  
  /** [Method] Does a binary search of the data on the x axis using the given key
    * @param key String
    * @returns *
    */
  var binarySearch: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var dataMaxX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMaxY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMinX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMinY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var dataX: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var dataY: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Get the nearest item index from point x y
    * @param x Number
    * @param y Number
    * @returns Number The index
    */
  var getIndexNearPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.native
  
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var labels: js.UndefOr[js.Any] = js.native
  
  /** [Method] Render the given visible clip range
    * @param surface Ext.draw.Surface
    * @param ctx Ext.draw.engine.Canvas/Ext.draw.engine.SvgContext
    * @param clip Array
    * @param region Arrary
    */
  var renderClipped: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[Array], 
      /* region */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @param region Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_ICartesian: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.native
}
object ICartesian {
  
  @scala.inline
  def apply(): ICartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesian]
  }
  
  @scala.inline
  implicit class ICartesianOps[Self <: ICartesian] (val x: Self) extends AnyVal {
    
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
    def setData(value: Array): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setIf(value: Boolean): Self = this.set("If", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("If", js.undefined)
    
    @scala.inline
    def setBinarySearch(value: /* key */ js.UndefOr[String] => _): Self = this.set("binarySearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBinarySearch: Self = this.set("binarySearch", js.undefined)
    
    @scala.inline
    def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = this.set("bindMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBindMarker: Self = this.set("bindMarker", js.undefined)
    
    @scala.inline
    def setDataMaxX(value: Double): Self = this.set("dataMaxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMaxX: Self = this.set("dataMaxX", js.undefined)
    
    @scala.inline
    def setDataMaxY(value: Double): Self = this.set("dataMaxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMaxY: Self = this.set("dataMaxY", js.undefined)
    
    @scala.inline
    def setDataMinX(value: Double): Self = this.set("dataMinX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMinX: Self = this.set("dataMinX", js.undefined)
    
    @scala.inline
    def setDataMinY(value: Double): Self = this.set("dataMinY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMinY: Self = this.set("dataMinY", js.undefined)
    
    @scala.inline
    def setDataX(value: js.Any): Self = this.set("dataX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataX: Self = this.set("dataX", js.undefined)
    
    @scala.inline
    def setDataY(value: js.Any): Self = this.set("dataY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataY: Self = this.set("dataY", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setGetField(value: () => String): Self = this.set("getField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetField: Self = this.set("getField", js.undefined)
    
    @scala.inline
    def setGetIndexNearPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = this.set("getIndexNearPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetIndexNearPoint: Self = this.set("getIndexNearPoint", js.undefined)
    
    @scala.inline
    def setLabelOverflowPadding(value: Double): Self = this.set("labelOverflowPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOverflowPadding: Self = this.set("labelOverflowPadding", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Any): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => _
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRenderClipped(
      value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[Array], /* region */ js.UndefOr[Array]) => Unit
    ): Self = this.set("renderClipped", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteRenderClipped: Self = this.set("renderClipped", js.undefined)
    
    @scala.inline
    def setSelectionTolerance(value: Double): Self = this.set("selectionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionTolerance: Self = this.set("selectionTolerance", js.undefined)
    
    @scala.inline
    def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = this.set("setField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetField: Self = this.set("setField", js.undefined)
  }
}
