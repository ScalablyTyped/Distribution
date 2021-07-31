package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def servers: js.Array[typings.steamClient.mod.Server] = typings.steamClient.mod.^.asInstanceOf[js.Dynamic].selectDynamic("servers").asInstanceOf[js.Array[typings.steamClient.mod.Server]]

type SendMessage = js.Function3[
/* header */ typings.steamClient.anon.Msg, 
/* body */ typings.node.Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
/* callback */ js.UndefOr[
  (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | typings.steamClient.steamClientBooleans.`false`
], 
scala.Unit]
