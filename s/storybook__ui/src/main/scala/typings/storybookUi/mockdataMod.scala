package typings.storybookUi

import typings.std.Record
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.anon.`111`
import typings.storybookUi.anon.`112`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockdataMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockDataset")
  @js.native
  val mockDataset: MockDataSet_ = js.native
  
  object mockExpanded {
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockExpanded")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockExpanded.noRoot")
    @js.native
    def noRoot: `112` = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockExpanded.noRootSecond")
    @js.native
    def noRootSecond: `112` = js.native
    @scala.inline
    def noRootSecond_=(x: `112`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noRootSecond")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def noRoot_=(x: `112`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockExpanded.withRoot")
    @js.native
    def withRoot: `111` = js.native
    @scala.inline
    def withRoot_=(x: `111`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withRoot")(x.asInstanceOf[js.Any])
  }
  
  object mockSelected {
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockSelected")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockSelected.noRoot")
    @js.native
    def noRoot: `112` = js.native
    @scala.inline
    def noRoot_=(x: `112`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/mockdata", "mockSelected.withRoot")
    @js.native
    def withRoot: `111` = js.native
    @scala.inline
    def withRoot_=(x: `111`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withRoot")(x.asInstanceOf[js.Any])
  }
  
  type MockDataSet_ = Record[String, StoriesHash]
}
