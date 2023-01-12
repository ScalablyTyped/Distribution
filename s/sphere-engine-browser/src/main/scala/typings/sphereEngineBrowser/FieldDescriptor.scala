package typings.sphereEngineBrowser

import typings.sphereEngineBrowser.sphereEngineBrowserStrings.bool
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.float32be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.float32le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.float64be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.float64le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.fstring
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.int16be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.int16le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.int32be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.int32le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.int8
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.lstr16be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.lstr16le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.lstr32be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.lstr32le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.lstr8
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.raw
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.uint16be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.uint16le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.uint32be
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.uint32le
import typings.sphereEngineBrowser.sphereEngineBrowserStrings.uint8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDescriptor extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: bool | float32be | float32le | float64be | float64le | int8 | int16be | int16le | int32be | int32le | uint8 | uint16be | uint16le | uint32be | uint32le | fstring | lstr8 | lstr16be | lstr16le | lstr32be | lstr32le | raw
}
object FieldDescriptor {
  
  inline def apply(
    `type`: bool | float32be | float32le | float64be | float64le | int8 | int16be | int16le | int32be | int32le | uint8 | uint16be | uint16le | uint32be | uint32le | fstring | lstr8 | lstr16be | lstr16le | lstr32be | lstr32le | raw
  ): FieldDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldDescriptor] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(
      value: bool | float32be | float32le | float64be | float64le | int8 | int16be | int16le | int32be | int32le | uint8 | uint16be | uint16le | uint32be | uint32le | fstring | lstr8 | lstr16be | lstr16le | lstr32be | lstr32le | raw
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
