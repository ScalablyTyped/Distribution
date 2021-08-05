package typings.sirenParser

import typings.sirenParser.actionMod.Action
import typings.sirenParser.mod.Entity
import typings.std.Error
import typings.superagent.mod.Response
import typings.superagent.mod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object superagentMod {
  
  @JSImport("siren-parser/superagent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(res: String): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(res.asInstanceOf[js.Any]).asInstanceOf[Entity]
  inline def parse(res: Response, fn: js.Function2[/* err */ Error | Null, /* body */ Entity, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(res.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def perform(request: js.Any, action: Action): SuperAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("perform")(request.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[SuperAgentRequest]
}
