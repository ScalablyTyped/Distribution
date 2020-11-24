package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.deadentry
import typings.stellarBase.stellarBaseStrings.initentry
import typings.stellarBase.stellarBaseStrings.liveentry
import typings.stellarBase.stellarBaseStrings.metaentry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketEntryType extends js.Object {
  
  val name: metaentry | liveentry | deadentry | initentry = js.native
  
  val value: `-1` | `0` | `1` | `2` = js.native
}
object BucketEntryType {
  
  @scala.inline
  def apply(name: metaentry | liveentry | deadentry | initentry, value: `-1` | `0` | `1` | `2`): BucketEntryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEntryType]
  }
  
  @scala.inline
  implicit class BucketEntryTypeOps[Self <: BucketEntryType] (val x: Self) extends AnyVal {
    
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
    def setName(value: metaentry | liveentry | deadentry | initentry): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `-1` | `0` | `1` | `2`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
