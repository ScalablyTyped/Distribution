package typings.psTree

import typings.psTree.mod.PS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def psTree(
    pid: Double,
    callback: js.Function2[/* error */ js.Error | Null, /* children */ js.Array[PS], Unit]
  ): Unit = (js.Dynamic.global.applyDynamic("ps_tree")(pid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
