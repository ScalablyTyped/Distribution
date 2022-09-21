package typings.rdflib

import typings.rdflib.fetcherMod._StatusValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdflibBooleans {
  
  @js.native
  sealed trait `false` extends StObject
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with _StatusValues
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
