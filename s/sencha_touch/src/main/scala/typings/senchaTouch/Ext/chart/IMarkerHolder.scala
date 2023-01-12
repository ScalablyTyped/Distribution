package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarkerHolder
  extends StObject
     with IBase {
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers], Unit]
  ] = js.undefined
}
object IMarkerHolder {
  
  inline def apply(): IMarkerHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkerHolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMarkerHolder] (val x: Self) extends AnyVal {
    
    inline def setBindMarker(value: (/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
    
    inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
  }
}
