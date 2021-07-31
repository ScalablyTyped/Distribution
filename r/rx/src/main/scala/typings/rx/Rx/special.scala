package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object special {
  
  type FlatMapResultSelector[T1, T2, TResult] = js.Function4[
    /* value */ T1, 
    /* selectorValue */ T2, 
    /* index */ Double, 
    /* selectorOther */ Double, 
    TResult
  ]
}
