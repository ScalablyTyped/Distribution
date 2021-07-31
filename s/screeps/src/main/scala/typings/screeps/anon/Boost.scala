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
  
  @scala.inline
  def apply[T /* <: BodyPartConstant */](hits: Double, `type`: T): Boost[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boost[T]]
  }
  
  @scala.inline
  implicit class BoostMutableBuilder[Self <: Boost[?], T /* <: BodyPartConstant */] (val x: Self & Boost[T]) extends AnyVal {
    
    @scala.inline
    def setBoost(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
    ): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    @scala.inline
    def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
