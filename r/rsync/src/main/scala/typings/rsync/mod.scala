package typings.rsync

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rsync", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Rsync
  @JSImport("rsync", JSImport.Namespace)
  @js.native
  val ^ : RsyncStatic = js.native
  
  type Flag = StringDictionary[Boolean]
  
  trait Pattern extends StObject {
    
    var action: String
    
    var pattern: String
  }
  object Pattern {
    
    @scala.inline
    def apply(action: String, pattern: String): Pattern = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rsync extends StObject {
    
    def archive(): Rsync = js.native
    
    def args(): js.Array[String] = js.native
    
    def chmod(flags: String): Rsync = js.native
    
    def command(): String = js.native
    
    def compress(): Rsync = js.native
    
    // cwd
    def cwd(cwd: String): String = js.native
    
    def delete(): Rsync = js.native
    
    def destination(): String = js.native
    def destination(d: String): Rsync = js.native
    
    def dirs(): Rsync = js.native
    
    def dry(): Rsync = js.native
    
    def exclude(p: String): Rsync = js.native
    def exclude(p: js.Array[String]): Rsync = js.native
    
    // accessor methods
    def executable(): String = js.native
    def executable(e: String): Rsync = js.native
    
    def executableShell(): String = js.native
    def executableShell(e: String): Rsync = js.native
    
    def execute(callback: js.Function3[/* err */ Error, /* code */ Double, /* cmd */ String, Unit]): ChildProcess = js.native
    def execute(
      callback: js.Function3[/* err */ Error, /* code */ Double, /* cmd */ String, Unit],
      stdout: StreamDataHandler,
      stderr: StreamDataHandler
    ): ChildProcess = js.native
    
    def flags(flags: js.Any*): Rsync = js.native
    def flags(flags: String): Rsync = js.native
    def flags(flags: String, set: Boolean): Rsync = js.native
    def flags(flags: js.Array[String]): Rsync = js.native
    def flags(flags: js.Array[String], set: Boolean): Rsync = js.native
    def flags(flags: Flag): Rsync = js.native
    
    def include(p: String): Rsync = js.native
    def include(p: js.Array[String]): Rsync = js.native
    
    def isSet(option: String): Boolean = js.native
    
    def links(): Rsync = js.native
    
    def option(option: String): js.Any = js.native
    
    def output(stdout: StreamDataHandler, stderr: StreamDataHandler): Rsync = js.native
    
    // pattern accessors
    def patterns(patterns: js.Array[String | Pattern]): Rsync = js.native
    
    def progress(): Rsync = js.native
    
    def quiet(): Rsync = js.native
    
    def recursive(): Rsync = js.native
    
    def set(option: String): Rsync = js.native
    // instance methods
    def set(option: String, value: String): Rsync = js.native
    
    // option shorthands
    def shell(shell: String): Rsync = js.native
    
    def source(): js.Array[String] = js.native
    def source(s: String): Rsync = js.native
    def source(s: js.Array[String]): Rsync = js.native
    
    def unset(option: String): Rsync = js.native
    
    def update(): Rsync = js.native
  }
  
  @js.native
  trait RsyncStatic
    extends StObject
       with Instantiable0[Rsync]
  
  type StreamDataHandler = js.Function1[/* data */ js.Any, Unit]
  
  type _To = RsyncStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RsyncStatic = ^
}
