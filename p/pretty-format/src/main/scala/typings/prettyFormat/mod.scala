package typings.prettyFormat

import typings.prettyFormat.typesMod.Plugins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  @JSImport("pretty-format", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any): String = js.native
  @JSImport("pretty-format", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = js.native
  
  object plugins {
    
    @JSImport("pretty-format", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pretty-format", "plugins.AsymmetricMatcher")
    @js.native
    def AsymmetricMatcher: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def AsymmetricMatcher_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ConvertAnsi")
    @js.native
    def ConvertAnsi: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def ConvertAnsi_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.DOMCollection")
    @js.native
    def DOMCollection: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def DOMCollection_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.DOMElement")
    @js.native
    def DOMElement: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def DOMElement_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.Immutable")
    @js.native
    def Immutable: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def Immutable_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ReactElement")
    @js.native
    def ReactElement: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def ReactElement_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ReactTestComponent")
    @js.native
    def ReactTestComponent: typings.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def ReactTestComponent_=(x: typings.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
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
