package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borrowers extends StObject {
  
  var borrowers: js.Array[typings.steamUser.mod.Borrowers]
}
object Borrowers {
  
  inline def apply(borrowers: js.Array[typings.steamUser.mod.Borrowers]): Borrowers = {
    val __obj = js.Dynamic.literal(borrowers = borrowers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borrowers]
  }
  
  extension [Self <: Borrowers](x: Self) {
    
    inline def setBorrowers(value: js.Array[typings.steamUser.mod.Borrowers]): Self = StObject.set(x, "borrowers", value.asInstanceOf[js.Any])
    
    inline def setBorrowersVarargs(value: typings.steamUser.mod.Borrowers*): Self = StObject.set(x, "borrowers", js.Array(value*))
  }
}
