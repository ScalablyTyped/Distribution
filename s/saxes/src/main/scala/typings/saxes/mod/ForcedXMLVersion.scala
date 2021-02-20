package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForcedXMLVersion extends XMLVersionOptions {
  
  @JSName("defaultXMLVersion")
  var defaultXMLVersion_ForcedXMLVersion: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]] = js.native
  
  @JSName("forceXMLVersion")
  var forceXMLVersion_ForcedXMLVersion: `true` = js.native
}
object ForcedXMLVersion {
  
  @scala.inline
  def apply(forceXMLVersion: `true`): ForcedXMLVersion = {
    val __obj = js.Dynamic.literal(forceXMLVersion = forceXMLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcedXMLVersion]
  }
  
  @scala.inline
  implicit class ForcedXMLVersionMutableBuilder[Self <: ForcedXMLVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultXMLVersion(value: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "defaultXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultXMLVersionUndefined: Self = StObject.set(x, "defaultXMLVersion", js.undefined)
    
    @scala.inline
    def setForceXMLVersion(value: `true`): Self = StObject.set(x, "forceXMLVersion", value.asInstanceOf[js.Any])
  }
}
