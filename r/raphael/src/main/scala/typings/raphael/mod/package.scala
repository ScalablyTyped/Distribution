package typings.raphael.mod

import org.scalablytyped.runtime.TopLevel
import typings.raphael.anon.Error
import typings.raphael.anon.PartialRaphaelAttributes
import typings.raphael.raphaelStrings.A
import typings.raphael.raphaelStrings.C
import typings.raphael.raphaelStrings.H
import typings.raphael.raphaelStrings.L
import typings.raphael.raphaelStrings.M
import typings.raphael.raphaelStrings.Q
import typings.raphael.raphaelStrings.R
import typings.raphael.raphaelStrings.S
import typings.raphael.raphaelStrings.T
import typings.raphael.raphaelStrings.V
import typings.raphael.raphaelStrings.Z
import typings.raphael.raphaelStrings.a_
import typings.raphael.raphaelStrings.c_
import typings.raphael.raphaelStrings.h_
import typings.raphael.raphaelStrings.l_
import typings.raphael.raphaelStrings.m_
import typings.raphael.raphaelStrings.q_
import typings.raphael.raphaelStrings.r_
import typings.raphael.raphaelStrings.s_
import typings.raphael.raphaelStrings.t_
import typings.raphael.raphaelStrings.v_
import typings.raphael.raphaelStrings.z_
import typings.std.DragEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type RaphaelBasicEventHandler[ThisContext, TEvent /* <: Event */] = /**
  * @param event The original DOM event that triggered the event this handler was registered for.
  * @return A value that is returned as the return value of the `document.addEventListener` callback.
  */
js.ThisFunction1[/* this */ ThisContext, /* event */ TEvent, Any]

type RaphaelConstructionOptionsArray4 = Array[String | Double | RaphaelShapeDescriptor]

type RaphaelConstructionOptionsArray5 = Array[Double | RaphaelShapeDescriptor]

type RaphaelCustomAttribute[TTechnology /* <: RaphaelTechnology */, TArgs /* <: js.Array[Double] */] = /**
  * @param values Numerical values for this custom attribute.
  * @return The SVG attributes for the given values.
  */
js.ThisFunction1[
/* this */ RaphaelElement[
  TTechnology, 
  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
], 
/* values */ TArgs, 
PartialRaphaelAttributes]

type RaphaelCustomEasingFormula = String

type RaphaelDragOnEndHandler[ThisContext] = /**
  * @param event DOM event object
  * @return A value that is returned as the return value of the `document.addEventListener` callback.
  */
js.ThisFunction1[/* this */ ThisContext, /* event */ DragEvent, Any]

type RaphaelDragOnMoveHandler[ThisContext] = /**
  * @param deltaX How much the pointer has moved in the horizontal direction compared to when this handler was most
  * recently invoked.
  * @param deltaY How much the pointer has moved in the vertical direction compared to when this handler was most
  * recently invoked.
  * @param mouseX The current horizontal position of the mouse.
  * @param mouseY The current vertical position of the mouse.
  * @return A value that is returned as the return value of the `document.addEventListener` callback.
  */
js.ThisFunction5[
/* this */ ThisContext, 
/* deltaX */ Double, 
/* deltaY */ Double, 
/* mouseX */ Double, 
/* mouseY */ Double, 
/* event */ DragEvent, 
Any]

type RaphaelDragOnOverHandler[TTechnology /* <: RaphaelTechnology */, ThisContext] = /**
  * @param targetElement The element you are dragging over.
  * @return A value that is returned as the return value of the `document.addEventListener` callback.
  */
js.ThisFunction1[
/* this */ ThisContext, 
/* targetElement */ RaphaelElement[
  TTechnology, 
  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
], 
Any]

type RaphaelDragOnStartHandler[ThisContext] = /**
  * @param x position of the mouse
  * @param y position of the mouse
  * @param event DOM event object
  * @return A value that is returned as the return value of the `document.addEventListener` callback.
  */
js.ThisFunction3[/* this */ ThisContext, /* x */ Double, /* y */ Double, /* event */ DragEvent, Any]

type RaphaelEasingFormula = /**
  * @param normalizedAnimationTime A percentage between `0` and `1`, with `0` representing the beginning and `1`
  * representing the end of the animation time.
  * @return The relative animation position, a percentage between `0` and `1` for where the animation should be at
  * the given animation time.
  */
js.Function1[/* normalizedAnimationTime */ Double, Double]

type RaphaelElementPluginMethod[TTechnology /* <: RaphaelTechnology */, TArgs /* <: js.Array[Any] */, TRetVal] = /**
  * @param args The arguments, as required by this element plugin. They need to be passed when the plugin method
  * is called on a {@link RaphaelElement}.
  * @return The value that should be returned by this plugin method. This is also the value that is returned when
  * this plugin method is called on a {@link RaphaelElement}.
  */
js.ThisFunction1[
/* this */ RaphaelElement[
  TTechnology, 
  /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
], 
/* args */ TArgs, 
TRetVal]

type RaphaelOnAnimationCompleteHandler[ThisContext] = js.ThisFunction0[/* this */ ThisContext, Unit]

type RaphaelPaperPluginMethod[TTechnology /* <: RaphaelTechnology */, TArgs /* <: js.Array[Any] */, TRetVal] = /**
  * @param args The arguments, as required by this paper plugin. They need to be passed when the plugin method
  * is called on a {@link RaphaelPaper}.
  * @return The value that should be returned by this plugin method. This is also the value that is returned when
  * this plugin method is called on a {@link RaphaelPaper}.
  */
js.ThisFunction1[/* this */ RaphaelPaper[TTechnology], /* args */ TArgs, TRetVal]

type RaphaelPaperPluginRegistry[TTechnology /* <: RaphaelTechnology */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: T[P] extends (args : any): any? raphael.raphael.RaphaelPaperPluginMethod<TTechnology, std.Parameters<T[P]>, std.ReturnType<T[P]>> : raphael.raphael.RaphaelPaperPluginRegistry<TTechnology, T[P]>}
  */ typings.raphael.raphaelStrings.RaphaelPaperPluginRegistry & TopLevel[Any]

type RaphaelPathSegment = (js.Tuple3[M | m_ | L | l_ | T | t_ | R | r_, Double, Double]) | (js.Tuple2[H | h_ | V | v_, Double]) | (js.Tuple5[Q | q_ | S | s_, Double, Double, Double, Double]) | (js.Tuple7[C | c_, Double, Double, Double, Double, Double, Double]) | (js.Tuple8[A | a_, Double, Double, Double, Double, Double, Double, Double]) | (js.Array[Z | z_])

type RaphaelPotentialFailure[T /* <: js.Object */] = T & Error

type RaphaelSetPluginMethod[TTechnology /* <: RaphaelTechnology */, TArgs /* <: js.Array[Any] */, TRetVal] = /**
  * @param args The arguments, as required by this set plugin. They need to be passed when the plugin method
  * is called on a {@link RaphaelSet}.
  * @return The value that should be returned by this plugin method. This is also the value that is returned when
  * this plugin method is called on a {@link RaphaelSet}.
  */
js.ThisFunction1[/* this */ RaphaelSet[TTechnology], /* args */ TArgs, TRetVal]

type RaphaelTransformSegment = (js.Tuple3[t_ | s_, Double, Double]) | (js.Tuple5[s_, Double, Double, Double, Double]) | (js.Tuple4[r_, Double, Double, Double]) | (js.Tuple2[r_, Double]) | (js.Tuple7[m_, Double, Double, Double, Double, Double, Double])

type RaphaelUnwrapElement[TTechnology /* <: RaphaelTechnology */, TBase /* <: RaphaelBaseElement[TTechnology] */] = TBase | (RaphaelElement[
TTechnology, 
/* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any])

type VMLCircleElement = VMLElement

type VMLElement = Element

type VMLEllipseElement = VMLElement

type VMLImageElement = VMLElement

type VMLPathElement = VMLElement

type VMLRectElement = VMLElement

type VMLTextElement = VMLElement
