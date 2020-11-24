package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.anon.Id
import typings.storybookUi.anon.Layout
import typings.storybookUi.refsMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", JSImport.Namespace)
@js.native
object refsStoriesMod extends js.Object {
  
  def Auth(): Element = js.native
  
  def Errored(): Element = js.native
  
  def IsEmpty(): Element = js.native
  
  def Long(): Element = js.native
  
  def Optimized(): Element = js.native
  
  def StartInjectedLoading(): Element = js.native
  
  def StartInjectedReady(): Element = js.native
  
  def StartInjectedUnknown(): Element = js.native
  
  def Versions(): Element = js.native
  
  def VersionsMissingCurrent(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[ComposedRef with RefProps] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var excludeStories: RegExp = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object loadingData extends js.Object {
    
    var menu: js.Array[Id] = js.native
  }
  
  @js.native
  object simpleData extends js.Object {
    
    var menu: js.Array[Id] = js.native
    
    var stories: StoriesHash = js.native
    
    var storyId: String = js.native
  }
}
