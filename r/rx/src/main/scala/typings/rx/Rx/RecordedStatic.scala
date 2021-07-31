package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordedStatic
  extends StObject
     with /**
  * Creates a new object recording the production of the specified value at the given virtual time.
  *
  * @constructor
  * @param {Number} time Virtual time the value was produced on.
  * @param {Mixed} value Value that was produced.
  * @param {Function} comparer An optional comparer.
  */
Instantiable2[/* time */ Double, /* value */ js.Any, Recorded]
     with Instantiable3[
      /* time */ Double, 
      /* value */ js.Any, 
      /* equalityComparer */ Comparer[js.Any, Boolean], 
      Recorded
    ]
