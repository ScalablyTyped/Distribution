package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionTriggerKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind & Double] = js.native
  
  /** Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API. */
  @js.native
  sealed trait Invoked
    extends StObject
       with CompletionTriggerKind
  /* 1 */ val Invoked: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionTriggerKind.Invoked & Double = js.native
  
  /** Completion was triggered by a trigger character. */
  @js.native
  sealed trait TriggerCharacter
    extends StObject
       with CompletionTriggerKind
  /* 2 */ val TriggerCharacter: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionTriggerKind.TriggerCharacter & Double = js.native
  
  /** Completion was re-triggered as the current completion list is incomplete. */
  @js.native
  sealed trait TriggerForIncompleteCompletions
    extends StObject
       with CompletionTriggerKind
  /* 3 */ val TriggerForIncompleteCompletions: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionTriggerKind.TriggerForIncompleteCompletions & Double = js.native
}
