package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TransactionResultPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results extends StObject {
  
  var results: js.Array[TransactionResultPair] = js.native
}
object Results {
  
  @scala.inline
  def apply(results: js.Array[TransactionResultPair]): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[TransactionResultPair]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: TransactionResultPair*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
