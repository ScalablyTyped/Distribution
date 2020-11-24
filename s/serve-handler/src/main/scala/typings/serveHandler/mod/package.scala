package typings.serveHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SendErrorHandler = js.Function7[
    /* absolutePath */ js.UndefOr[java.lang.String], 
    /* response */ js.UndefOr[typings.node.httpMod.ServerResponse], 
    /* acceptsJSON */ js.UndefOr[scala.Boolean], 
    /* current */ js.UndefOr[java.lang.String], 
    /* handlers */ js.UndefOr[typings.serveHandler.mod.Methods], 
    /* config */ js.UndefOr[typings.serveHandler.mod.Config], 
    /* spec */ js.UndefOr[js.Any], 
    js.Promise[scala.Unit]
  ]
}
