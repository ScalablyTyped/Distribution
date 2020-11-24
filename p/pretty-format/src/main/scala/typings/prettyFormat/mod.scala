package typings.prettyFormat

import typings.prettyFormat.typesMod.Plugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pretty-format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  def apply(`val`: js.Any): String = js.native
  def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = js.native
  
  @js.native
  object plugins extends js.Object {
    
    var AsymmetricMatcher: typings.prettyFormat.typesMod.NewPlugin = js.native
    
    var ConvertAnsi: typings.prettyFormat.typesMod.NewPlugin = js.native
    
    var DOMCollection: typings.prettyFormat.typesMod.NewPlugin = js.native
    
    var DOMElement: typings.prettyFormat.typesMod.NewPlugin = js.native
    
    var Immutable: typings.prettyFormat.typesMod.NewPlugin = js.native
    
    var ReactElement: typings.prettyFormat.typesMod.NewPlugin = js.native
    
    var ReactTestComponent: typings.prettyFormat.typesMod.NewPlugin = js.native
  }
  
  type Colors = typings.prettyFormat.typesMod.Colors
  
  type Config = typings.prettyFormat.typesMod.Config
  
  type NewPlugin = typings.prettyFormat.typesMod.NewPlugin
  
  type OldPlugin = typings.prettyFormat.typesMod.OldPlugin
  
  type Options = typings.prettyFormat.typesMod.Options
  
  type OptionsReceived = typings.prettyFormat.typesMod.OptionsReceived
  
  type Plugin = typings.prettyFormat.typesMod.Plugin
  
  type Plugins_ = Plugins
  
  type Refs = typings.prettyFormat.typesMod.Refs
  
  type Theme = typings.prettyFormat.typesMod.Theme
}
