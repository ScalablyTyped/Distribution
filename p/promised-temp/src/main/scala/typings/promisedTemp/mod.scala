package typings.promisedTemp

import org.scalablytyped.runtime.Shortcut
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("promised-temp", JSImport.Namespace)
  @js.native
  val ^ : TempStatic = js.native
  
  type AffixOptions = typings.temp.mod.AffixOptions
  
  type OpenFile = typings.temp.mod.OpenFile
  
  type Stats = typings.temp.mod.Stats
  
  @js.native
  trait TempStatic extends StObject {
    
    def cleanup(): js.Promise[Boolean | Stats] = js.native
    
    def createWriteStream(): js.Promise[WriteStream] = js.native
    def createWriteStream(affixes: String): js.Promise[WriteStream] = js.native
    def createWriteStream(affixes: AffixOptions): js.Promise[WriteStream] = js.native
    
    var dir: String = js.native
    
    def mkdir(): js.Promise[String] = js.native
    def mkdir(affixes: String): js.Promise[String] = js.native
    def mkdir(affixes: AffixOptions): js.Promise[String] = js.native
    
    def open(): js.Promise[OpenFile] = js.native
    def open(affixes: String): js.Promise[OpenFile] = js.native
    def open(affixes: AffixOptions): js.Promise[OpenFile] = js.native
    
    def path(): String = js.native
    def path(affixes: js.UndefOr[scala.Nothing], defaultPrefix: String): String = js.native
    def path(affixes: String): String = js.native
    def path(affixes: String, defaultPrefix: String): String = js.native
    def path(affixes: AffixOptions): String = js.native
    def path(affixes: AffixOptions, defaultPrefix: String): String = js.native
    
    def track(): TempStatic = js.native
    def track(value: Boolean): TempStatic = js.native
  }
  
  type _To = TempStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TempStatic = ^
}
