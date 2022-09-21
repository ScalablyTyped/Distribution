package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.anon.Description
import typings.reactNativeCommunityCliTypes.mod.DetachedCommandFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doctorMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-doctor/build/commands/doctor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-doctor/build/commands/doctor", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/commands/doctor", "default.detached")
    @js.native
    def detached: Boolean = js.native
    inline def detached_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detached")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/commands/doctor", "default.func")
    @js.native
    def func: DetachedCommandFunction[FlagsT] = js.native
    inline def func(argv: js.Array[String], args: FlagsT): js.Promise[Unit] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(argv.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit] | Unit]
    inline def func_=(x: DetachedCommandFunction[FlagsT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/commands/doctor", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/commands/doctor", "default.options")
    @js.native
    def options: js.Array[Description] = js.native
    inline def options_=(x: js.Array[Description]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  trait FlagsT extends StObject {
    
    var contributor: Boolean | Unit
    
    var fix: Boolean | Unit
  }
  object FlagsT {
    
    inline def apply(contributor: Boolean | Unit, fix: Boolean | Unit): FlagsT = {
      val __obj = js.Dynamic.literal(contributor = contributor.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagsT]
    }
    
    extension [Self <: FlagsT](x: Self) {
      
      inline def setContributor(value: Boolean | Unit): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
      
      inline def setFix(value: Boolean | Unit): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    }
  }
}
