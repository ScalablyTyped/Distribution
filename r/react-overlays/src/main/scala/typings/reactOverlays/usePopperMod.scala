package typings.reactOverlays

import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.reactOverlays.anon.PartialCSSStyleDeclaratio
import typings.reactOverlays.anon.PartialModifieranyany
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePopperMod {
  
  @JSImport("react-overlays/cjs/usePopper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Position an element relative some reference element using Popper.js
    *
    * @param referenceElement
    * @param popperElement
    * @param {object}      options
    * @param {object=}     options.modifiers Popper.js modifiers
    * @param {boolean=}    options.enabled toggle the popper functionality on/off
    * @param {string=}     options.placement The popper element placement relative to the reference element
    * @param {string=}     options.strategy the positioning strategy
    * @param {boolean=}    options.eventsEnabled have Popper listen on window resize events to reposition the element
    * @param {function=}   options.onCreate called when the popper is created
    * @param {function=}   options.onUpdate called when the popper is updated
    *
    * @returns {UsePopperState} The popper state
    */
  @scala.inline
  def default(): UsePopperState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: Null,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: Null,
    popperElement: Unit,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(referenceElement: Null, popperElement: HTMLElement): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: Null,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: Unit,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: Unit,
    popperElement: Unit,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(referenceElement: Unit, popperElement: HTMLElement): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: Unit,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(referenceElement: VirtualElement): UsePopperState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any]).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: VirtualElement,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: VirtualElement,
    popperElement: Unit,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(referenceElement: VirtualElement, popperElement: HTMLElement): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  @scala.inline
  def default(
    referenceElement: VirtualElement,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  
  type Instance = typings.popperjsCore.typesMod.Instance
  
  type Modifier[Name, Options] = typings.popperjsCore.typesMod.Modifier[Name, Options]
  
  type ModifierMap = Record[String, PartialModifieranyany]
  
  /* Inlined @popperjs/core.@popperjs/core.Options['modifiers'] | std.Record<string, std.Partial<react-overlays.react-overlays/cjs/usePopper.Modifier<any, any>>> */
  /* Rewritten from type alias, can be one of: 
    - typings.reactOverlays.reactOverlaysStrings.map
    - typings.reactOverlays.reactOverlaysStrings.length
    - typings.reactOverlays.reactOverlaysStrings.entries
    - typings.reactOverlays.reactOverlaysStrings.pop
    - typings.reactOverlays.reactOverlaysStrings.fill
    - typings.reactOverlays.reactOverlaysStrings.join
    - typings.reactOverlays.reactOverlaysStrings.copyWithin
    - typings.reactOverlays.reactOverlaysStrings.keys
    - typings.reactOverlays.reactOverlaysStrings.sort
    - typings.reactOverlays.reactOverlaysStrings.forEach
    - typings.reactOverlays.reactOverlaysStrings.concat
    - typings.reactOverlays.reactOverlaysStrings.includes
    - typings.reactOverlays.reactOverlaysStrings.slice
    - typings.reactOverlays.reactOverlaysStrings.shift
    - typings.reactOverlays.reactOverlaysStrings.push
    - typings.reactOverlays.reactOverlaysStrings.reverse
    - typings.reactOverlays.reactOverlaysStrings.flat
    - typings.reactOverlays.reactOverlaysStrings.splice
    - typings.reactOverlays.reactOverlaysStrings.some
    - typings.reactOverlays.reactOverlaysStrings.unshift
    - typings.reactOverlays.reactOverlaysStrings.filter
    - typings.reactOverlays.reactOverlaysStrings.toString
    - typings.reactOverlays.reactOverlaysStrings.indexOf
    - typings.reactOverlays.reactOverlaysStrings.reduceRight
    - typings.reactOverlays.reactOverlaysStrings.findIndex
    - typings.reactOverlays.reactOverlaysStrings.reduce
    - typings.reactOverlays.reactOverlaysStrings.values
    - typings.reactOverlays.reactOverlaysStrings.flatMap
    - typings.reactOverlays.reactOverlaysStrings.toLocaleString
    - typings.reactOverlays.reactOverlaysStrings.every
    - typings.reactOverlays.reactOverlaysStrings.lastIndexOf
    - typings.reactOverlays.reactOverlaysStrings.find
  */
  trait Modifiers extends StObject
  object Modifiers {
    
    @scala.inline
    def concat: typings.reactOverlays.reactOverlaysStrings.concat = "concat".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.concat]
    
    @scala.inline
    def copyWithin: typings.reactOverlays.reactOverlaysStrings.copyWithin = "copyWithin".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.copyWithin]
    
    @scala.inline
    def entries: typings.reactOverlays.reactOverlaysStrings.entries = "entries".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.entries]
    
    @scala.inline
    def every: typings.reactOverlays.reactOverlaysStrings.every = "every".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.every]
    
    @scala.inline
    def fill: typings.reactOverlays.reactOverlaysStrings.fill = "fill".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.fill]
    
    @scala.inline
    def filter: typings.reactOverlays.reactOverlaysStrings.filter = "filter".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.filter]
    
    @scala.inline
    def find: typings.reactOverlays.reactOverlaysStrings.find = "find".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.find]
    
    @scala.inline
    def findIndex: typings.reactOverlays.reactOverlaysStrings.findIndex = "findIndex".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.findIndex]
    
    @scala.inline
    def flat: typings.reactOverlays.reactOverlaysStrings.flat = "flat".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.flat]
    
    @scala.inline
    def flatMap: typings.reactOverlays.reactOverlaysStrings.flatMap = "flatMap".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.flatMap]
    
    @scala.inline
    def forEach: typings.reactOverlays.reactOverlaysStrings.forEach = "forEach".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.forEach]
    
    @scala.inline
    def includes: typings.reactOverlays.reactOverlaysStrings.includes = "includes".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.includes]
    
    @scala.inline
    def indexOf: typings.reactOverlays.reactOverlaysStrings.indexOf = "indexOf".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.indexOf]
    
    @scala.inline
    def join: typings.reactOverlays.reactOverlaysStrings.join = "join".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.join]
    
    @scala.inline
    def keys: typings.reactOverlays.reactOverlaysStrings.keys = "keys".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.keys]
    
    @scala.inline
    def lastIndexOf: typings.reactOverlays.reactOverlaysStrings.lastIndexOf = "lastIndexOf".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.lastIndexOf]
    
    @scala.inline
    def length: typings.reactOverlays.reactOverlaysStrings.length = "length".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.length]
    
    @scala.inline
    def map: typings.reactOverlays.reactOverlaysStrings.map = "map".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.map]
    
    @scala.inline
    def pop: typings.reactOverlays.reactOverlaysStrings.pop = "pop".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.pop]
    
    @scala.inline
    def push: typings.reactOverlays.reactOverlaysStrings.push = "push".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.push]
    
    @scala.inline
    def reduce: typings.reactOverlays.reactOverlaysStrings.reduce = "reduce".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.reduce]
    
    @scala.inline
    def reduceRight: typings.reactOverlays.reactOverlaysStrings.reduceRight = "reduceRight".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.reduceRight]
    
    @scala.inline
    def reverse: typings.reactOverlays.reactOverlaysStrings.reverse = "reverse".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.reverse]
    
    @scala.inline
    def shift: typings.reactOverlays.reactOverlaysStrings.shift = "shift".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.shift]
    
    @scala.inline
    def slice: typings.reactOverlays.reactOverlaysStrings.slice = "slice".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.slice]
    
    @scala.inline
    def some: typings.reactOverlays.reactOverlaysStrings.some = "some".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.some]
    
    @scala.inline
    def sort: typings.reactOverlays.reactOverlaysStrings.sort = "sort".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.sort]
    
    @scala.inline
    def splice: typings.reactOverlays.reactOverlaysStrings.splice = "splice".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.splice]
    
    @scala.inline
    def unshift: typings.reactOverlays.reactOverlaysStrings.unshift = "unshift".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.unshift]
    
    @scala.inline
    def values: typings.reactOverlays.reactOverlaysStrings.values = "values".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.values]
  }
  
  type Offset = OffsetFunction | OffsetValue
  
  type OffsetFunction = js.Function1[/* details */ typings.reactOverlays.anon.Placement, OffsetValue]
  
  type OffsetValue = js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
  
  type Options = typings.popperjsCore.typesMod.Options
  
  type Placement = typings.popperjsCore.enumsMod.Placement
  
  type State = typings.popperjsCore.typesMod.State
  
  /* Inlined std.Omit<react-overlays.react-overlays/cjs/usePopper.Options, 'modifiers' | 'placement' | 'strategy'> & {  enabled :boolean | undefined,   placement :react-overlays.react-overlays/cjs/usePopper.Options['placement'] | undefined,   strategy :react-overlays.react-overlays/cjs/usePopper.Options['strategy'] | undefined,   modifiers :react-overlays.react-overlays/cjs/usePopper.Options['modifiers'] | undefined} */
  trait UsePopperOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[typings.popperjsCore.anon.PartialModifieranyany]] = js.undefined
    
    var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.undefined
    
    var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.undefined
    
    var strategy: js.UndefOr[PositioningStrategy] = js.undefined
  }
  object UsePopperOptions {
    
    @scala.inline
    def apply(): UsePopperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsePopperOptions]
    }
    
    @scala.inline
    implicit class UsePopperOptionsMutableBuilder[Self <: UsePopperOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Array[typings.popperjsCore.anon.PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setModifiersVarargs(value: typings.popperjsCore.anon.PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
      
      @scala.inline
      def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      @scala.inline
      def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait UsePopperState extends StObject {
    
    var attributes: Record[String, Record[String, js.Any]]
    
    def forceUpdate(): Unit
    
    var placement: Placement
    
    var state: js.UndefOr[State] = js.undefined
    
    var styles: Record[String, PartialCSSStyleDeclaratio]
    
    def update(): Unit
  }
  object UsePopperState {
    
    @scala.inline
    def apply(
      attributes: Record[String, Record[String, js.Any]],
      forceUpdate: () => Unit,
      placement: Placement,
      styles: Record[String, PartialCSSStyleDeclaratio],
      update: () => Unit
    ): UsePopperState = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[UsePopperState]
    }
    
    @scala.inline
    implicit class UsePopperStateMutableBuilder[Self <: UsePopperState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, Record[String, js.Any]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStyles(value: Record[String, PartialCSSStyleDeclaratio]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  type VirtualElement = typings.popperjsCore.typesMod.VirtualElement
}
