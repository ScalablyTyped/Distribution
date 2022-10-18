package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportedCliCommands extends StObject
@JSImport("snyk/dist/lib/types", "SupportedCliCommands")
@js.native
object SupportedCliCommands extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SupportedCliCommands & String] = js.native
  
  @js.native
  sealed trait about
    extends StObject
       with SupportedCliCommands
  /* "about" */ val about: typings.snyk.distLibTypesMod.SupportedCliCommands.about & String = js.native
  
  @js.native
  sealed trait apps
    extends StObject
       with SupportedCliCommands
  /* "apps" */ val apps: typings.snyk.distLibTypesMod.SupportedCliCommands.apps & String = js.native
  
  @js.native
  sealed trait describe
    extends StObject
       with SupportedCliCommands
  /* "describe" */ val describe: typings.snyk.distLibTypesMod.SupportedCliCommands.describe & String = js.native
  
  @js.native
  sealed trait drift
    extends StObject
       with SupportedCliCommands
  /* "drift" */ val drift: typings.snyk.distLibTypesMod.SupportedCliCommands.drift & String = js.native
  
  @js.native
  sealed trait fix
    extends StObject
       with SupportedCliCommands
  /* "fix" */ val fix: typings.snyk.distLibTypesMod.SupportedCliCommands.fix & String = js.native
  
  @js.native
  sealed trait help
    extends StObject
       with SupportedCliCommands
  /* "help" */ val help: typings.snyk.distLibTypesMod.SupportedCliCommands.help & String = js.native
  
  @js.native
  sealed trait ignore
    extends StObject
       with SupportedCliCommands
  /* "ignore" */ val ignore: typings.snyk.distLibTypesMod.SupportedCliCommands.ignore & String = js.native
  
  @js.native
  sealed trait log4shell
    extends StObject
       with SupportedCliCommands
  /* "log4shell" */ val log4shell: typings.snyk.distLibTypesMod.SupportedCliCommands.log4shell & String = js.native
  
  @js.native
  sealed trait monitor
    extends StObject
       with SupportedCliCommands
  /* "monitor" */ val monitor: typings.snyk.distLibTypesMod.SupportedCliCommands.monitor & String = js.native
  
  @js.native
  sealed trait policy
    extends StObject
       with SupportedCliCommands
  /* "policy" */ val policy: typings.snyk.distLibTypesMod.SupportedCliCommands.policy & String = js.native
  
  @js.native
  sealed trait protect
    extends StObject
       with SupportedCliCommands
  /* "protect" */ val protect: typings.snyk.distLibTypesMod.SupportedCliCommands.protect & String = js.native
  
  @js.native
  sealed trait test
    extends StObject
       with SupportedCliCommands
  /* "test" */ val test: typings.snyk.distLibTypesMod.SupportedCliCommands.test & String = js.native
  
  @js.native
  sealed trait `update-exclude-policy`
    extends StObject
       with SupportedCliCommands
  /* "update-exclude-policy" */ val `update-exclude-policy`: typings.snyk.distLibTypesMod.SupportedCliCommands.`update-exclude-policy` & String = js.native
  
  @js.native
  sealed trait version
    extends StObject
       with SupportedCliCommands
  /* "version" */ val version: typings.snyk.distLibTypesMod.SupportedCliCommands.version & String = js.native
  
  @js.native
  sealed trait wizard
    extends StObject
       with SupportedCliCommands
  /* "wizard" */ val wizard: typings.snyk.distLibTypesMod.SupportedCliCommands.wizard & String = js.native
  
  @js.native
  sealed trait woof
    extends StObject
       with SupportedCliCommands
  /* "woof" */ val woof: typings.snyk.distLibTypesMod.SupportedCliCommands.woof & String = js.native
}
