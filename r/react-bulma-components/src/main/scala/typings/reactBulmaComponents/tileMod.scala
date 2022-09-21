package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`10`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`11`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`12`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`1`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`2`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`3`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`4`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`5`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`6`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`7`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`8`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`9`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.ancestor
import typings.reactBulmaComponents.reactBulmaComponentsStrings.child
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/tile", JSImport.Default)
  @js.native
  val default: BulmaComponent[TileProps, div] = js.native
  
  trait TileProps extends StObject {
    
    var kind: js.UndefOr[ancestor | parent | child] = js.undefined
    
    var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object TileProps {
    
    inline def apply(): TileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileProps]
    }
    
    extension [Self <: TileProps](x: Self) {
      
      inline def setKind(value: ancestor | parent | child): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = BulmaComponent[TileProps, div]
  
  /* This means you don't have to write `default`, but can instead just say `tileMod.foo` */
  override def _to: BulmaComponent[TileProps, div] = default
}
