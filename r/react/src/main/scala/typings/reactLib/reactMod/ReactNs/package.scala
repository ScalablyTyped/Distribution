package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactNs {
  type AnimationEventHandler[T] = EventHandler[AnimationEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]
  type CElement[P, T /* <: Component[P, ComponentState, _] */] = ComponentElement[P, T]
  type CFactory[P, T /* <: Component[P, ComponentState, _] */] = ComponentFactory[P, T]
  type CSSProperties = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  /**
       * We use an intersection type to infer multiple type parameters from
       * a single argument, which is useful for many top-level API defs.
       * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
       */
  type ClassType[P, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */] = C with (ScalablyTyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[/* context */ js.Any], T])
  type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]
  type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]
  type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]
  type ComponentFactory[P, T /* <: Component[P, ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[ClassAttributes[T] with P], 
    /* repeated */ReactNode, 
    CElement[P, T]
  ]
  type ComponentPropsWithRef[T /* <: ReactType[_] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[_] with RefAttributes[stdLib.InstanceType[T]])
  type ComponentPropsWithoutRef[T /* <: ReactType[_] */] = PropsWithoutRef[ComponentProps[T]]
  type ComponentState = js.Any
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | FunctionComponent[P]
  type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]
  type Consumer[T] = ExoticComponent[ConsumerProps[T]]
  type ContextType[C /* <: Context[_] */] = js.Any
  type DOMFactory[P /* <: DOMAttributes[T] */, T /* <: reactLib.Element */] = js.Function2[
    /* props */ js.UndefOr[ClassAttributes[T] with (P | scala.Null)], 
    /* repeated */ReactNode, 
    DOMElement[P, T]
  ]
  type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] with E
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  type DragEventHandler[T] = EventHandler[DragEvent[T]]
  // NOTE: Currently, in alpha.0, the effect callbacks are actually allowed to return anything,
  // but functions are treated specially. The next version published with hooks will warn if you actually
  // return anything besides `void` or a callback. Async effects need to call an async function inside
  // them.
  type EffectCallback = js.Function0[scala.Unit | js.Function0[scala.Unit]]
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: SyntheticEvent[_] */] = js.Function1[/* event */ E, scala.Unit]
  type FC[P] = FunctionComponent[P]
  //
  // Factories
  // ----------------------------------------------------------------------
  type Factory[P] = js.Function2[/* props */ js.UndefOr[Attributes with P], /* repeated */ReactNode, ReactElement[P]]
  type FocusEventHandler[T] = EventHandler[FocusEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = SyntheticEvent[T]
  type FormEventHandler[T] = EventHandler[FormEvent[T]]
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[Attributes with P], 
    /* repeated */ReactNode, 
    FunctionComponentElement[P]
  ]
  type GetDerivedStateFromError[P, S] = /**
           * This lifecycle is invoked after an error has been thrown by a descendant component.
           * It receives the error that was thrown as a parameter and should return a value to update state.
           *
           * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
           */
  js.Function1[/* error */ js.Any, stdLib.Partial[S] | scala.Null]
  type GetDerivedStateFromProps[P, S] = /**
           * Returns an update to a component's state based on its new props and old state.
           *
           * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
           */
  js.Function2[
    /* nextProps */ stdLib.Readonly[P], 
    /* prevState */ S, 
    stdLib.Partial[S] | scala.Null
  ]
  // tslint:disable-next-line:no-empty-interface
  type HTMLFactory[T /* <: reactLib.HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type InputIdentityList = js.Array[js.Any]
  type Key = java.lang.String | scala.Double
  type KeyboardEventHandler[T] = EventHandler[KeyboardEvent[T]]
  type LegacyRef[T] = java.lang.String | Ref[T]
  type MouseEventHandler[T] = EventHandler[MouseEvent[T]]
  type PointerEventHandler[T] = EventHandler[PointerEvent[T]]
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (PropsWithoutRef[P] with reactLib.Anon_Ref)
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactLib.reactLibStrings.ref]])
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = ProviderExoticComponent[ProviderProps[T]]
  type PureComponent[P, S, SS] = Component[P, S, SS]
  type ReactChild = ReactElement[js.Any] | ReactText
  type ReactEventHandler[T] = EventHandler[SyntheticEvent[T]]
  type ReactFragment = js.Object | ReactNodeArray
  // ReactHTML for ReactHTMLElement
  // tslint:disable-next-line:no-empty-interface
  type ReactHTMLElement[T /* <: reactLib.HTMLElement */] = DetailedReactHTMLElement[AllHTMLAttributes[T], T]
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = (Component[js.Any, js.Object, js.Any]) | reactLib.Element
  type ReactNode = js.UndefOr[ReactChild | ReactFragment | ReactPortal | scala.Boolean | scala.Null]
  //
  // React Nodes
  // http://facebook.github.io/react/docs/glossary.html
  // ----------------------------------------------------------------------
  type ReactText = java.lang.String | scala.Double
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ReactType[P] = (/* import warning: Failed type conversion: TsTypeLookup(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(K),TsTypeUnion(List(TsTypeLiteral(TsLiteralString(a)), TsTypeLiteral(TsLiteralString(abbr)), TsTypeLiteral(TsLiteralString(address)), TsTypeLiteral(TsLiteralString(area)), TsTypeLiteral(TsLiteralString(article)), TsTypeLiteral(TsLiteralString(aside)), TsTypeLiteral(TsLiteralString(audio)), TsTypeLiteral(TsLiteralString(b)), TsTypeLiteral(TsLiteralString(base)), TsTypeLiteral(TsLiteralString(bdi)), TsTypeLiteral(TsLiteralString(bdo)), TsTypeLiteral(TsLiteralString(big)), TsTypeLiteral(TsLiteralString(blockquote)), TsTypeLiteral(TsLiteralString(body)), TsTypeLiteral(TsLiteralString(br)), TsTypeLiteral(TsLiteralString(button)), TsTypeLiteral(TsLiteralString(canvas)), TsTypeLiteral(TsLiteralString(caption)), TsTypeLiteral(TsLiteralString(cite)), TsTypeLiteral(TsLiteralString(code)), TsTypeLiteral(TsLiteralString(col)), TsTypeLiteral(TsLiteralString(colgroup)), TsTypeLiteral(TsLiteralString(data)), TsTypeLiteral(TsLiteralString(datalist)), TsTypeLiteral(TsLiteralString(dd)), TsTypeLiteral(TsLiteralString(del)), TsTypeLiteral(TsLiteralString(details)), TsTypeLiteral(TsLiteralString(dfn)), TsTypeLiteral(TsLiteralString(dialog)), TsTypeLiteral(TsLiteralString(div)), TsTypeLiteral(TsLiteralString(dl)), TsTypeLiteral(TsLiteralString(dt)), TsTypeLiteral(TsLiteralString(em)), TsTypeLiteral(TsLiteralString(embed)), TsTypeLiteral(TsLiteralString(fieldset)), TsTypeLiteral(TsLiteralString(figcaption)), TsTypeLiteral(TsLiteralString(figure)), TsTypeLiteral(TsLiteralString(footer)), TsTypeLiteral(TsLiteralString(form)), TsTypeLiteral(TsLiteralString(h1)), TsTypeLiteral(TsLiteralString(h2)), TsTypeLiteral(TsLiteralString(h3)), TsTypeLiteral(TsLiteralString(h4)), TsTypeLiteral(TsLiteralString(h5)), TsTypeLiteral(TsLiteralString(h6)), TsTypeLiteral(TsLiteralString(head)), TsTypeLiteral(TsLiteralString(header)), TsTypeLiteral(TsLiteralString(hgroup)), TsTypeLiteral(TsLiteralString(hr)), TsTypeLiteral(TsLiteralString(html)), TsTypeLiteral(TsLiteralString(i)), TsTypeLiteral(TsLiteralString(iframe)), TsTypeLiteral(TsLiteralString(img)), TsTypeLiteral(TsLiteralString(input)), TsTypeLiteral(TsLiteralString(ins)), TsTypeLiteral(TsLiteralString(kbd)), TsTypeLiteral(TsLiteralString(keygen)), TsTypeLiteral(TsLiteralString(label)), TsTypeLiteral(TsLiteralString(legend)), TsTypeLiteral(TsLiteralString(li)), TsTypeLiteral(TsLiteralString(link)), TsTypeLiteral(TsLiteralString(main)), TsTypeLiteral(TsLiteralString(map)), TsTypeLiteral(TsLiteralString(mark)), TsTypeLiteral(TsLiteralString(menu)), TsTypeLiteral(TsLiteralString(menuitem)), TsTypeLiteral(TsLiteralString(meta)), TsTypeLiteral(TsLiteralString(meter)), TsTypeLiteral(TsLiteralString(nav)), TsTypeLiteral(TsLiteralString(noindex)), TsTypeLiteral(TsLiteralString(noscript)), TsTypeLiteral(TsLiteralString(object)), TsTypeLiteral(TsLiteralString(ol)), TsTypeLiteral(TsLiteralString(optgroup)), TsTypeLiteral(TsLiteralString(option)), TsTypeLiteral(TsLiteralString(output)), TsTypeLiteral(TsLiteralString(p)), TsTypeLiteral(TsLiteralString(param)), TsTypeLiteral(TsLiteralString(picture)), TsTypeLiteral(TsLiteralString(pre)), TsTypeLiteral(TsLiteralString(progress)), TsTypeLiteral(TsLiteralString(q)), TsTypeLiteral(TsLiteralString(rp)), TsTypeLiteral(TsLiteralString(rt)), TsTypeLiteral(TsLiteralString(ruby)), TsTypeLiteral(TsLiteralString(s)), TsTypeLiteral(TsLiteralString(samp)), TsTypeLiteral(TsLiteralString(script)), TsTypeLiteral(TsLiteralString(section)), TsTypeLiteral(TsLiteralString(select)), TsTypeLiteral(TsLiteralString(small)), TsTypeLiteral(TsLiteralString(source)), TsTypeLiteral(TsLiteralString(span)), TsTypeLiteral(TsLiteralString(strong)), TsTypeLiteral(TsLiteralString(style)), TsTypeLiteral(TsLiteralString(sub)), TsTypeLiteral(TsLiteralString(summary)), TsTypeLiteral(TsLiteralString(sup)), TsTypeLiteral(TsLiteralString(table)), TsTypeLiteral(TsLiteralString(tbody)), TsTypeLiteral(TsLiteralString(td)), TsTypeLiteral(TsLiteralString(textarea)), TsTypeLiteral(TsLiteralString(tfoot)), TsTypeLiteral(TsLiteralString(th)), TsTypeLiteral(TsLiteralString(thead)), TsTypeLiteral(TsLiteralString(time)), TsTypeLiteral(TsLiteralString(title)), TsTypeLiteral(TsLiteralString(tr)), TsTypeLiteral(TsLiteralString(track)), TsTypeLiteral(TsLiteralString(u)), TsTypeLiteral(TsLiteralString(ul)), TsTypeLiteral(TsLiteralString(var)), TsTypeLiteral(TsLiteralString(video)), TsTypeLiteral(TsLiteralString(wbr)), TsTypeLiteral(TsLiteralString(webview)), TsTypeLiteral(TsLiteralString(svg)), TsTypeLiteral(TsLiteralString(animate)), TsTypeLiteral(TsLiteralString(animateTransform)), TsTypeLiteral(TsLiteralString(circle)), TsTypeLiteral(TsLiteralString(clipPath)), TsTypeLiteral(TsLiteralString(defs)), TsTypeLiteral(TsLiteralString(desc)), TsTypeLiteral(TsLiteralString(ellipse)), TsTypeLiteral(TsLiteralString(feBlend)), TsTypeLiteral(TsLiteralString(feColorMatrix)), TsTypeLiteral(TsLiteralString(feComponentTransfer)), TsTypeLiteral(TsLiteralString(feComposite)), TsTypeLiteral(TsLiteralString(feConvolveMatrix)), TsTypeLiteral(TsLiteralString(feDiffuseLighting)), TsTypeLiteral(TsLiteralString(feDisplacementMap)), TsTypeLiteral(TsLiteralString(feDistantLight)), TsTypeLiteral(TsLiteralString(feFlood)), TsTypeLiteral(TsLiteralString(feFuncA)), TsTypeLiteral(TsLiteralString(feFuncB)), TsTypeLiteral(TsLiteralString(feFuncG)), TsTypeLiteral(TsLiteralString(feFuncR)), TsTypeLiteral(TsLiteralString(feGaussianBlur)), TsTypeLiteral(TsLiteralString(feImage)), TsTypeLiteral(TsLiteralString(feMerge)), TsTypeLiteral(TsLiteralString(feMergeNode)), TsTypeLiteral(TsLiteralString(feMorphology)), TsTypeLiteral(TsLiteralString(feOffset)), TsTypeLiteral(TsLiteralString(fePointLight)), TsTypeLiteral(TsLiteralString(feSpecularLighting)), TsTypeLiteral(TsLiteralString(feSpotLight)), TsTypeLiteral(TsLiteralString(feTile)), TsTypeLiteral(TsLiteralString(feTurbulence)), TsTypeLiteral(TsLiteralString(filter)), TsTypeLiteral(TsLiteralString(foreignObject)), TsTypeLiteral(TsLiteralString(g)), TsTypeLiteral(TsLiteralString(image)), TsTypeLiteral(TsLiteralString(line)), TsTypeLiteral(TsLiteralString(linearGradient)), TsTypeLiteral(TsLiteralString(marker)), TsTypeLiteral(TsLiteralString(mask)), TsTypeLiteral(TsLiteralString(metadata)), TsTypeLiteral(TsLiteralString(path)), TsTypeLiteral(TsLiteralString(pattern)), TsTypeLiteral(TsLiteralString(polygon)), TsTypeLiteral(TsLiteralString(polyline)), TsTypeLiteral(TsLiteralString(radialGradient)), TsTypeLiteral(TsLiteralString(rect)), TsTypeLiteral(TsLiteralString(stop)), TsTypeLiteral(TsLiteralString(switch)), TsTypeLiteral(TsLiteralString(symbol)), TsTypeLiteral(TsLiteralString(text)), TsTypeLiteral(TsLiteralString(textPath)), TsTypeLiteral(TsLiteralString(tspan)), TsTypeLiteral(TsLiteralString(use)), TsTypeLiteral(TsLiteralString(view)))),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(K))),List())))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(react), TsIdentModule(None,List(react)), TsIdentSimple(Global), TsIdentNamespace(JSX), TsIdentSimple(IntrinsicElements))),List())))) */js.Any) | ComponentType[P]
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  type Ref[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | RefObject[T] | scala.Null
  type Requireable[T] = propDashTypesLib.propDashTypesMod.Requireable[T]
  //
  // Class Interfaces
  // ----------------------------------------------------------------------
  /**
       * @deprecated as of recent React versions, function components can no
       * longer be considered 'stateless'. Please use `FunctionComponent` instead.
       *
       * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
       */
  type SFC[P] = FunctionComponent[P]
  /**
       * @deprecated Please use `FunctionComponentElement`
       */
  type SFCElement[P] = FunctionComponentElement[P]
  /**
       * @deprecated Please use `FunctionComponentFactory`
       */
  type SFCFactory[P] = FunctionComponentFactory[P]
  //
  // React Hooks
  // ----------------------------------------------------------------------
  // based on the code in https://github.com/facebook/react/pull/13968
  // Unlike the class component setState, the updates are not allowed to be partial
  type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])
  /**
       * @deprecated as of recent React versions, function components can no
       * longer be considered 'stateless'. Please use `FunctionComponent` instead.
       *
       * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
       */
  type StatelessComponent[P] = FunctionComponent[P]
  type TouchEventHandler[T] = EventHandler[TouchEvent[T]]
  type TransitionEventHandler[T] = EventHandler[TransitionEvent[T]]
  type UIEventHandler[T] = EventHandler[UIEvent[T]]
  type ValidationMap[T] = propDashTypesLib.propDashTypesMod.ValidationMap[T]
  //
  // React.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = propDashTypesLib.propDashTypesMod.Validator[T]
  type WheelEventHandler[T] = EventHandler[WheelEvent[T]]
}
