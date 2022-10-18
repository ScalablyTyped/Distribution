package typings.slate

import typings.slate.distInterfacesEditorMod.NodeMatch
import typings.slate.distInterfacesEditorMod.PropsCompare
import typings.slate.distInterfacesEditorMod.PropsMerge
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesOperationMod.BaseSetSelectionOperation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesTypesMod.MaximizeMode
import typings.slate.distInterfacesTypesMod.RangeMode
import typings.slate.slateStrings.set_selection
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Always[T /* <: Node */] extends StObject {
    
    var always: js.UndefOr[Boolean] = js.undefined
    
    var at: js.UndefOr[Location] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[RangeMode] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object Always {
    
    inline def apply[T /* <: Node */](): Always[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Always[T]]
    }
    
    extension [Self <: Always[?], T /* <: Node */](x: Self & Always[T]) {
      
      inline def setAlways(value: Boolean): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
      
      inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: RangeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait At[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var hanging: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[RangeMode] = js.undefined
    
    var select: js.UndefOr[Boolean] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object At {
    
    inline def apply[T /* <: Node */](): At[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[At[T]]
    }
    
    extension [Self <: At[?], T /* <: Node */](x: Self & At[T]) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setHanging(value: Boolean): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: RangeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait Compare[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var compare: js.UndefOr[PropsCompare] = js.undefined
    
    var hanging: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var merge: js.UndefOr[PropsMerge] = js.undefined
    
    var mode: js.UndefOr[MaximizeMode] = js.undefined
    
    var split: js.UndefOr[Boolean] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object Compare {
    
    inline def apply[T /* <: Node */](): Compare[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compare[T]]
    }
    
    extension [Self <: Compare[?], T /* <: Node */](x: Self & Compare[T]) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setCompare(value: (/* prop */ Partial[Node], /* node */ Partial[Node]) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setHanging(value: Boolean): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMerge(value: (/* prop */ Partial[Node], /* node */ Partial[Node]) => js.Object): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setMode(value: MaximizeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait Hanging[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var hanging: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[RangeMode] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object Hanging {
    
    inline def apply[T /* <: Node */](): Hanging[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hanging[T]]
    }
    
    extension [Self <: Hanging[?], T /* <: Node */](x: Self & Hanging[T]) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setHanging(value: Boolean): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: RangeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait Match[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[MaximizeMode] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object Match {
    
    inline def apply[T /* <: Node */](): Match[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Match[T]]
    }
    
    extension [Self <: Match[?], T /* <: Node */](x: Self & Match[T]) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: MaximizeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait Mode[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[MaximizeMode] = js.undefined
    
    var to: Path
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object Mode {
    
    inline def apply[T /* <: Node */](to: Path): Mode[T] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mode[T]]
    }
    
    extension [Self <: Mode[?], T /* <: Node */](x: Self & Mode[T]) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: MaximizeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait NewProperties
    extends StObject
       with BaseSetSelectionOperation {
    
    var newProperties: Range
    
    var properties: Null
    
    var `type`: set_selection
  }
  object NewProperties {
    
    inline def apply(newProperties: Range, properties: Null): NewProperties = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_selection")
      __obj.asInstanceOf[NewProperties]
    }
    
    extension [Self <: NewProperties](x: Self) {
      
      inline def setNewProperties(value: Range): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Null): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: set_selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Properties
    extends StObject
       with BaseSetSelectionOperation {
    
    var newProperties: Partial[Range]
    
    var properties: Partial[Range]
    
    var `type`: set_selection
  }
  object Properties {
    
    inline def apply(newProperties: Partial[Range], properties: Partial[Range]): Properties = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_selection")
      __obj.asInstanceOf[Properties]
    }
    
    extension [Self <: Properties](x: Self) {
      
      inline def setNewProperties(value: Partial[Range]): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Partial[Range]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: set_selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Split[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[MaximizeMode] = js.undefined
    
    var split: js.UndefOr[Boolean] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object Split {
    
    inline def apply[T /* <: Node */](): Split[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Split[T]]
    }
    
    extension [Self <: Split[?], T /* <: Node */](x: Self & Split[T]) {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: MaximizeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
  
  trait Type
    extends StObject
       with BaseSetSelectionOperation {
    
    var newProperties: Null
    
    var properties: Range
    
    var `type`: set_selection
  }
  object Type {
    
    inline def apply(newProperties: Null, properties: Range): Type = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_selection")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setNewProperties(value: Null): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Range): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: set_selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
