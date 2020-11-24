package typings.storybookUi

import typings.std.Record
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.anon.`111`
import typings.storybookUi.anon.`112`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/mockdata", JSImport.Namespace)
@js.native
object mockdataMod extends js.Object {
  
  val mockDataset: MockDataSet_ = js.native
  
  @js.native
  object mockExpanded extends js.Object {
    
    var noRoot: `112` = js.native
    
    var noRootSecond: `112` = js.native
    
    var withRoot: `111` = js.native
  }
  
  @js.native
  object mockSelected extends js.Object {
    
    var noRoot: `112` = js.native
    
    var withRoot: `111` = js.native
  }
  
  type MockDataSet_ = Record[String, StoriesHash]
}
