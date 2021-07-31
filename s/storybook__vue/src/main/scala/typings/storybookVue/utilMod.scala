package typings.storybookVue

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@storybook/vue/dist/client/preview/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractProps(component: VueConstructor[Vue]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractProps")(component.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
}
