package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.allowTrustCantRevoke
import typings.stellarBase.stellarBaseStrings.allowTrustMalformed
import typings.stellarBase.stellarBaseStrings.allowTrustNoTrustLine
import typings.stellarBase.stellarBaseStrings.allowTrustSelfNotAllowed
import typings.stellarBase.stellarBaseStrings.allowTrustSuccess
import typings.stellarBase.stellarBaseStrings.allowTrustTrustNotRequired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowTrustResultCode extends StObject {
  
  val name: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}
object AllowTrustResultCode {
  
  @scala.inline
  def apply(
    name: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): AllowTrustResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrustResultCode]
  }
  
  @scala.inline
  implicit class AllowTrustResultCodeMutableBuilder[Self <: AllowTrustResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
