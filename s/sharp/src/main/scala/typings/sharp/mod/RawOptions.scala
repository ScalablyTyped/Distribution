package typings.sharp.mod

import typings.sharp.sharpStrings.char
import typings.sharp.sharpStrings.complex
import typings.sharp.sharpStrings.double
import typings.sharp.sharpStrings.dpcomplex
import typings.sharp.sharpStrings.float
import typings.sharp.sharpStrings.int
import typings.sharp.sharpStrings.short
import typings.sharp.sharpStrings.uchar
import typings.sharp.sharpStrings.uint
import typings.sharp.sharpStrings.ushort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawOptions extends StObject {
  
  var depth: js.UndefOr[
    char | uchar | short | ushort | int | uint | float | complex | double | dpcomplex
  ] = js.undefined
}
object RawOptions {
  
  inline def apply(): RawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawOptions] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: char | uchar | short | ushort | int | uint | float | complex | double | dpcomplex): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
  }
}
