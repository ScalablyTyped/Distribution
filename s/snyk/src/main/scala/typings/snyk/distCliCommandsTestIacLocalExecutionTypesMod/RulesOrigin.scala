package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RulesOrigin extends StObject
@JSImport("snyk/dist/cli/commands/test/iac/local-execution/types", "RulesOrigin")
@js.native
object RulesOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RulesOrigin & String] = js.native
  
  @js.native
  sealed trait Internal
    extends StObject
       with RulesOrigin
  /* "internal" */ val Internal: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin.Internal & String = js.native
  
  @js.native
  sealed trait Local
    extends StObject
       with RulesOrigin
  /* "local" */ val Local: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin.Local & String = js.native
  
  @js.native
  sealed trait Remote
    extends StObject
       with RulesOrigin
  /* "remote" */ val Remote: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin.Remote & String = js.native
}
