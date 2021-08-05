package typings.screeps.anon

import typings.screeps.BodyPartConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boost[T /* <: BodyPartConstant */] extends StObject {
  
  /**
    * One of the `RESOURCE_*` constants.
    *
    * If the body part is boosted, this property specifies the mineral type which is used for boosting.
    */
  var boost: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
  ] = js.undefined
  
  /**
    * The remaining amount of hit points of this body part.
    */
  var hits: Double
  
  /**
    * One of the body part types constants.
    */
  var `type`: T
}
object Boost {
  
  inline def apply[T /* <: BodyPartConstant */](hits: Double, `type`: T): Boost[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boost[T]]
  }
  
  extension [Self <: Boost[?], T /* <: BodyPartConstant */](x: Self & Boost[T]) {
    
    inline def setBoost(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
    ): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
