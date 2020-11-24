package typings.probeImageSize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ProbeCallback = js.Function2[
    /* err */ typings.probeImageSize.mod.ProbeError | scala.Null, 
    /* result */ typings.probeImageSize.mod.ProbeResult, 
    scala.Unit
  ]
}
