package typings.storybookAddonStoryshots.storyshotsOptionsMod

import typings.glob.mod.IOptions
import typings.std.RegExp
import typings.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import typings.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typings.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryshotsOptions extends js.Object {
  
  var asyncJest: js.UndefOr[Boolean] = js.native
  
  var config: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.native
  
  var configPath: js.UndefOr[String] = js.native
  
  var framework: js.UndefOr[SupportedFramework] = js.native
  
  var integrityOptions: js.UndefOr[IOptions | `false`] = js.native
  
  var renderer: js.UndefOr[js.Function] = js.native
  
  /**
    * @Deprecated The functionality of this option is completely covered by snapshotSerializers which should be used instead.
    */
  var serializer: js.UndefOr[js.Any] = js.native
  
  var snapshotSerializers: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
    ]
  ] = js.native
  
  var stories2snapsConverter: js.UndefOr[Stories2SnapsConverter] = js.native
  
  var storyKindRegex: js.UndefOr[RegExp | String] = js.native
  
  var storyNameRegex: js.UndefOr[RegExp | String] = js.native
  
  var suite: js.UndefOr[String] = js.native
  
  var test: js.UndefOr[StoryshotsTestMethod] = js.native
}
object StoryshotsOptions {
  
  @scala.inline
  def apply(): StoryshotsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryshotsOptions]
  }
  
  @scala.inline
  implicit class StoryshotsOptionsOps[Self <: StoryshotsOptions] (val x: Self) extends AnyVal {
    
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
    def setAsyncJest(value: Boolean): Self = this.set("asyncJest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncJest: Self = this.set("asyncJest", js.undefined)
    
    @scala.inline
    def setConfig(value: /* options */ js.Any => Unit): Self = this.set("config", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    
    @scala.inline
    def setFramework(value: SupportedFramework): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setIntegrityOptions(value: IOptions | `false`): Self = this.set("integrityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrityOptions: Self = this.set("integrityOptions", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Function): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setSerializer(value: js.Any): Self = this.set("serializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
    
    @scala.inline
    def setSnapshotSerializersVarargs(value: js.Any*): Self = this.set("snapshotSerializers", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotSerializers(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
        ]
    ): Self = this.set("snapshotSerializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSerializers: Self = this.set("snapshotSerializers", js.undefined)
    
    @scala.inline
    def setStories2snapsConverter(value: Stories2SnapsConverter): Self = this.set("stories2snapsConverter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStories2snapsConverter: Self = this.set("stories2snapsConverter", js.undefined)
    
    @scala.inline
    def setStoryKindRegex(value: RegExp | String): Self = this.set("storyKindRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryKindRegex: Self = this.set("storyKindRegex", js.undefined)
    
    @scala.inline
    def setStoryNameRegex(value: RegExp | String): Self = this.set("storyNameRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryNameRegex: Self = this.set("storyNameRegex", js.undefined)
    
    @scala.inline
    def setSuite(value: String): Self = this.set("suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuite: Self = this.set("suite", js.undefined)
    
    @scala.inline
    def setTest(value: StoryshotsTestMethod): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
