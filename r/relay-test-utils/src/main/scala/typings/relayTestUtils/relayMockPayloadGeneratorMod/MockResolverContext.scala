package typings.relayTestUtils.relayMockPayloadGeneratorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockResolverContext extends js.Object {
  
  var alias: js.UndefOr[String] = js.native
  
  var args: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentType: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[js.Array[String]] = js.native
}
object MockResolverContext {
  
  @scala.inline
  def apply(): MockResolverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockResolverContext]
  }
  
  @scala.inline
  implicit class MockResolverContextOps[Self <: MockResolverContext] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setArgs(value: StringDictionary[js.Any]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentType(value: String): Self = this.set("parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentType: Self = this.set("parentType", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
