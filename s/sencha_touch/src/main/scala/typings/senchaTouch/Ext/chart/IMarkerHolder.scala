package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMarkerHolder extends IBase {
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers], Unit]
  ] = js.native
}
object IMarkerHolder {
  
  @scala.inline
  def apply(): IMarkerHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkerHolder]
  }
  
  @scala.inline
  implicit class IMarkerHolderMutableBuilder[Self <: IMarkerHolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindMarker(value: (/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
  }
}
