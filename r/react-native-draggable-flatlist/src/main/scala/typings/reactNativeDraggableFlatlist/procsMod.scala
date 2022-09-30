package typings.reactNativeDraggableFlatlist

import typings.reactNativeReanimated.mod.Animated.SpringConfig
import typings.reactNativeReanimated.mod.Animated.SpringState
import typings.reactNativeReanimated.mod.Animated.Value
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object procsMod {
  
  @JSImport("react-native-draggable-flatlist/lib/procs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIsAfterActive(currentIndex: Node, activeIndex: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsAfterActive")(currentIndex.asInstanceOf[js.Any], activeIndex.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def hardReset(position: Value, finished: Value, time: Value, toValue: Value): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("hardReset")(position.asInstanceOf[js.Any], finished.asInstanceOf[js.Any], time.asInstanceOf[js.Any], toValue.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setupCell(
    currentIndex: Value,
    size: Node,
    offset: Node,
    isAfterActive: Value,
    prevToValue: Value,
    prevSpacerIndex: Value,
    activeIndex: Node,
    activeCellSize: Node,
    hoverOffset: Node,
    spacerIndex: Value,
    toValue: Value,
    position: Value,
    time: Value,
    finished: Value,
    runSpring: Node,
    onFinished: Node,
    isDraggingCell: Node,
    placeholderOffset: Value,
    prevIsDraggingCell: Value,
    clock: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Clock */ Any,
    disabled: Node
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setupCell")(currentIndex.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], isAfterActive.asInstanceOf[js.Any], prevToValue.asInstanceOf[js.Any], prevSpacerIndex.asInstanceOf[js.Any], activeIndex.asInstanceOf[js.Any], activeCellSize.asInstanceOf[js.Any], hoverOffset.asInstanceOf[js.Any], spacerIndex.asInstanceOf[js.Any], toValue.asInstanceOf[js.Any], position.asInstanceOf[js.Any], time.asInstanceOf[js.Any], finished.asInstanceOf[js.Any], runSpring.asInstanceOf[js.Any], onFinished.asInstanceOf[js.Any], isDraggingCell.asInstanceOf[js.Any], placeholderOffset.asInstanceOf[js.Any], prevIsDraggingCell.asInstanceOf[js.Any], clock.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def springFill(
    clock: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Clock */ Any,
    state: SpringState,
    config: SpringConfig
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("springFill")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Node]
}
