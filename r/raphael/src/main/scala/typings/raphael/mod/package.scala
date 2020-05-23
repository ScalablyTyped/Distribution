package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RaphaelBasicEventHandler[ThisContext, TEvent /* <: typings.std.Event */] = /**
    * @param event The original DOM event that triggered the event this handler was registered for.
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction1[/* this */ ThisContext, /* event */ TEvent, js.Any]
  type RaphaelConstructionOptionsArray4 = Array[java.lang.String | scala.Double | typings.raphael.mod.RaphaelShapeDescriptor]
  type RaphaelConstructionOptionsArray5 = Array[scala.Double | typings.raphael.mod.RaphaelShapeDescriptor]
  type RaphaelCustomAttribute[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[scala.Double] */] = /**
    * @param values Numerical values for this custom attribute.
    * @return The SVG attributes for the given values.
    */
  js.ThisFunction1[
    /* this */ typings.raphael.mod.RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    /* values */ TArgs, 
    typings.raphael.anon.PartialRaphaelAttributes
  ]
  type RaphaelCustomEasingFormula = java.lang.String with js.Object
  type RaphaelDragOnEndHandler[ThisContext] = /**
    * @param event DOM event object
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction1[/* this */ ThisContext, /* event */ typings.std.DragEvent, js.Any]
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
    /* deltaX */ scala.Double, 
    /* deltaY */ scala.Double, 
    /* mouseX */ scala.Double, 
    /* mouseY */ scala.Double, 
    /* event */ typings.std.DragEvent, 
    js.Any
  ]
  type RaphaelDragOnOverHandler[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, ThisContext] = /**
    * @param targetElement The element you are dragging over.
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction1[
    /* this */ ThisContext, 
    /* targetElement */ typings.raphael.mod.RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    js.Any
  ]
  type RaphaelDragOnStartHandler[ThisContext] = /**
    * @param x position of the mouse
    * @param y position of the mouse
    * @param event DOM event object
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction3[
    /* this */ ThisContext, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* event */ typings.std.DragEvent, 
    js.Any
  ]
  type RaphaelEasingFormula = /**
    * @param normalizedAnimationTime A percentage between `0` and `1`, with `0` representing the beginning and `1`
    * representing the end of the animation time.
    * @return The relative animation position, a percentage between `0` and `1` for where the animation should be at
    * the given animation time.
    */
  js.Function1[/* normalizedAnimationTime */ scala.Double, scala.Double]
  type RaphaelElementPluginMethod[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[_] */, TRetVal] = /**
    * @param args The arguments, as required by this element plugin. They need to be passed when the plugin method
    * is called on a {@link RaphaelElement}.
    * @return The value that should be returned by this plugin method. This is also the value that is returned when
    * this plugin method is called on a {@link RaphaelElement}.
    */
  js.ThisFunction1[
    /* this */ typings.raphael.mod.RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    /* args */ TArgs, 
    TRetVal
  ]
  type RaphaelOnAnimationCompleteHandler[ThisContext] = js.ThisFunction0[/* this */ ThisContext, scala.Unit]
  type RaphaelPaperPluginMethod[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[_] */, TRetVal] = /**
    * @param args The arguments, as required by this paper plugin. They need to be passed when the plugin method
    * is called on a {@link RaphaelPaper}.
    * @return The value that should be returned by this plugin method. This is also the value that is returned when
    * this plugin method is called on a {@link RaphaelPaper}.
    */
  js.ThisFunction1[/* this */ typings.raphael.mod.RaphaelPaper[TTechnology], /* args */ TArgs, TRetVal]
  type RaphaelPaperPluginRegistry[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends (args : any): any? raphael.raphael.RaphaelPaperPluginMethod<TTechnology, std.Parameters<T[P]>, std.ReturnType<T[P]>> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias raphael.raphael.RaphaelPaperPluginRegistry<TTechnology, T[P]> * / object}
    */ typings.raphael.raphaelStrings.RaphaelPaperPluginRegistry with org.scalablytyped.runtime.TopLevel[js.Any]
  type RaphaelPathSegment = (js.Tuple3[
    typings.raphael.raphaelStrings.M | typings.raphael.raphaelStrings.m_ | typings.raphael.raphaelStrings.L | typings.raphael.raphaelStrings.l_ | typings.raphael.raphaelStrings.T | typings.raphael.raphaelStrings.t_ | typings.raphael.raphaelStrings.R | typings.raphael.raphaelStrings.r_, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple2[
    typings.raphael.raphaelStrings.H | typings.raphael.raphaelStrings.h_ | typings.raphael.raphaelStrings.V | typings.raphael.raphaelStrings.v_, 
    scala.Double
  ]) | (js.Tuple5[
    typings.raphael.raphaelStrings.Q | typings.raphael.raphaelStrings.q_ | typings.raphael.raphaelStrings.S | typings.raphael.raphaelStrings.s_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple7[
    typings.raphael.raphaelStrings.C | typings.raphael.raphaelStrings.c_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple8[
    typings.raphael.raphaelStrings.A | typings.raphael.raphaelStrings.a_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Array[typings.raphael.raphaelStrings.Z | typings.raphael.raphaelStrings.z_])
  type RaphaelPotentialFailure[T /* <: js.Object */] = T with typings.raphael.anon.Error
  type RaphaelSetPluginMethod[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[_] */, TRetVal] = /**
    * @param args The arguments, as required by this set plugin. They need to be passed when the plugin method
    * is called on a {@link RaphaelSet}.
    * @return The value that should be returned by this plugin method. This is also the value that is returned when
    * this plugin method is called on a {@link RaphaelSet}.
    */
  js.ThisFunction1[/* this */ typings.raphael.mod.RaphaelSet[TTechnology], /* args */ TArgs, TRetVal]
  type RaphaelTransformSegment = (js.Tuple3[
    typings.raphael.raphaelStrings.t_ | typings.raphael.raphaelStrings.s_, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple5[
    typings.raphael.raphaelStrings.s_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple4[typings.raphael.raphaelStrings.r_, scala.Double, scala.Double, scala.Double]) | (js.Tuple2[typings.raphael.raphaelStrings.r_, scala.Double]) | (js.Tuple7[
    typings.raphael.raphaelStrings.m_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ])
  type RaphaelUnwrapElement[TTechnology /* <: typings.raphael.mod.RaphaelTechnology */, TBase /* <: typings.raphael.mod.RaphaelBaseElement[TTechnology] */] = TBase | (typings.raphael.mod.RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ])
  type VMLCircleElement = typings.raphael.mod.VMLElement
  type VMLElement = typings.std.Element
  type VMLEllipseElement = typings.raphael.mod.VMLElement
  type VMLImageElement = typings.raphael.mod.VMLElement
  type VMLPathElement = typings.raphael.mod.VMLElement
  type VMLRectElement = typings.raphael.mod.VMLElement
  type VMLTextElement = typings.raphael.mod.VMLElement
}
