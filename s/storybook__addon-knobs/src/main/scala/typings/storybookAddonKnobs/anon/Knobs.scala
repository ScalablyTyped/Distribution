package typings.storybookAddonKnobs.anon

import typings.std.Record
import typings.storybookAddonKnobs.distKnobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Knobs extends StObject {
  
  var knobs: Record[String, KnobStoreKnob]
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object Knobs {
  
  inline def apply(knobs: Record[String, KnobStoreKnob]): Knobs = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knobs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Knobs] (val x: Self) extends AnyVal {
    
    inline def setKnobs(value: Record[String, KnobStoreKnob]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
