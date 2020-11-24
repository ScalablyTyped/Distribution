package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseNumbers.`5`
import typings.stellarBase.stellarBaseStrings.claimPredicateAnd
import typings.stellarBase.stellarBaseStrings.claimPredicateBeforeAbsoluteTime
import typings.stellarBase.stellarBaseStrings.claimPredicateBeforeRelativeTime
import typings.stellarBase.stellarBaseStrings.claimPredicateNot
import typings.stellarBase.stellarBaseStrings.claimPredicateOr
import typings.stellarBase.stellarBaseStrings.claimPredicateUnconditional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimPredicateType extends js.Object {
  
  val name: claimPredicateUnconditional | claimPredicateAnd | claimPredicateOr | claimPredicateNot | claimPredicateBeforeAbsoluteTime | claimPredicateBeforeRelativeTime = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` = js.native
}
object ClaimPredicateType {
  
  @scala.inline
  def apply(
    name: claimPredicateUnconditional | claimPredicateAnd | claimPredicateOr | claimPredicateNot | claimPredicateBeforeAbsoluteTime | claimPredicateBeforeRelativeTime,
    value: `0` | `1` | `2` | `3` | `4` | `5`
  ): ClaimPredicateType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimPredicateType]
  }
  
  @scala.inline
  implicit class ClaimPredicateTypeOps[Self <: ClaimPredicateType] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: claimPredicateUnconditional | claimPredicateAnd | claimPredicateOr | claimPredicateNot | claimPredicateBeforeAbsoluteTime | claimPredicateBeforeRelativeTime
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
