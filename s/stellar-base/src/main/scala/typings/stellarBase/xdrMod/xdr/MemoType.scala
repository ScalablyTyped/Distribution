package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseStrings.memoHash
import typings.stellarBase.stellarBaseStrings.memoId
import typings.stellarBase.stellarBaseStrings.memoNone
import typings.stellarBase.stellarBaseStrings.memoReturn
import typings.stellarBase.stellarBaseStrings.memoText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoType extends js.Object {
  
  val name: memoNone | memoText | memoId | memoHash | memoReturn = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object MemoType {
  
  @scala.inline
  def apply(name: memoNone | memoText | memoId | memoHash | memoReturn, value: `0` | `1` | `2` | `3` | `4`): MemoType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoType]
  }
  
  @scala.inline
  implicit class MemoTypeOps[Self <: MemoType] (val x: Self) extends AnyVal {
    
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
    def setName(value: memoNone | memoText | memoId | memoHash | memoReturn): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
