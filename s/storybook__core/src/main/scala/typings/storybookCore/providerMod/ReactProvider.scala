package typings.storybookCore.providerMod

import typings.storybookAddons.distMod.Collection
import typings.storybookAddons.distMod.Config
import typings.storybookAddons.typesMod.Types_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider * / any */ @js.native
trait ReactProvider extends js.Object {
  
  var addons: js.Any = js.native
  
  var channel: js.Any = js.native
  
  def getConfig(): Config = js.native
  
  def getElements(`type`: Types_): Collection = js.native
  
  def handleAPI(api: js.Any): Unit = js.native
}
object ReactProvider {
  
  @scala.inline
  def apply(
    addons: js.Any,
    channel: js.Any,
    getConfig: () => Config,
    getElements: Types_ => Collection,
    handleAPI: js.Any => Unit
  ): ReactProvider = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getElements = js.Any.fromFunction1(getElements), handleAPI = js.Any.fromFunction1(handleAPI))
    __obj.asInstanceOf[ReactProvider]
  }
  
  @scala.inline
  implicit class ReactProviderOps[Self <: ReactProvider] (val x: Self) extends AnyVal {
    
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
    def setAddons(value: js.Any): Self = this.set("addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: js.Any): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConfig(value: () => Config): Self = this.set("getConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElements(value: Types_ => Collection): Self = this.set("getElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleAPI(value: js.Any => Unit): Self = this.set("handleAPI", js.Any.fromFunction1(value))
  }
}
