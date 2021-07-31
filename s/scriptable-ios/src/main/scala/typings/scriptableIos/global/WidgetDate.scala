package typings.scriptableIos.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Date element shown in a widget._
  * @see https://docs.scriptable.app/widgetdate
  */
@JSGlobal("WidgetDate")
@js.native
class WidgetDate ()
  extends StObject
     with typings.scriptableIos.WidgetDate {
  
  /**
    * _Display entire date._
    *
    * Example output: June 3, 2019
    *
    * This is the default.
    * @see https://docs.scriptable.app/widgetdate/#-applydatestyle
    */
  /* CompleteClass */
  override def applyDateStyle(): Unit = js.native
  
  /**
    * _Display date as offset from now._
    *
    * Example output: +2 hours -3 months
    * @see https://docs.scriptable.app/widgetdate/#-applyoffsetstyle
    */
  /* CompleteClass */
  override def applyOffsetStyle(): Unit = js.native
  
  /**
    * _Display date as relative to now._
    *
    * Example output: 2 hours, 23 minutes 1 year, 1 month
    * @see https://docs.scriptable.app/widgetdate/#-applyrelativestyle
    */
  /* CompleteClass */
  override def applyRelativeStyle(): Unit = js.native
  
  /**
    * _Display time component of the date._
    *
    * Example output: 11:23PM
    * @see https://docs.scriptable.app/widgetdate/#-applytimestyle
    */
  /* CompleteClass */
  override def applyTimeStyle(): Unit = js.native
  
  /**
    * _Display date as timer counting from now._
    *
    * Example output: 2:32 36:59:01
    * @see https://docs.scriptable.app/widgetdate/#-applytimerstyle
    */
  /* CompleteClass */
  override def applyTimerStyle(): Unit = js.native
  
  /**
    * _Center aligns the text._
    *
    * Specifies that text should be center aligned.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text in the center of a horizontal stack, you should place a spacer both
    * before and after the text.
    * @see https://docs.scriptable.app/widgetdate/#-centeraligntext
    */
  /* CompleteClass */
  override def centerAlignText(): Unit = js.native
  
  /**
    * _Date to show in a widget._
    * @see https://docs.scriptable.app/widgetdate/#date
    */
  /* CompleteClass */
  var date: Date = js.native
  
  /**
    * _Font and text size of the text._
    * @see https://docs.scriptable.app/widgetdate/#font
    */
  /* CompleteClass */
  var font: typings.scriptableIos.Font = js.native
  
  /**
    * _Left aligns the text._
    *
    * Specifies that text should be left aligned. This is the default.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text to left in a horizontal stack, you should place a spacer
    * after the text.
    * @see https://docs.scriptable.app/widgetdate/#-leftaligntext
    */
  /* CompleteClass */
  override def leftAlignText(): Unit = js.native
  
  /**
    * _Maximum number of lines._
    *
    * Maximum number of lines to display. The limit is disabled when the value is 0 or less. Defaults to 0.
    * @see https://docs.scriptable.app/widgetdate/#linelimit
    */
  /* CompleteClass */
  var lineLimit: Double = js.native
  
  /**
    * _Minimum amount the text scales down to._
    *
    * Sets the minimum amount that text scales down to fit in the available space. For example, a text with a minimum scale factor of 0.5 allows the widget to draw the text in a font
    * size half the size of the actual font. The scale factor should be a fraction between 0 and 1, both inclusive. Defaults to 1.
    * @see https://docs.scriptable.app/widgetdate/#minimumscalefactor
    */
  /* CompleteClass */
  var minimumScaleFactor: Double = js.native
  
  /**
    * _Right aligns the text._
    *
    * Specifies that text should be right aligned.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text to the right in a horizontal stack, you should place a spacer
    * before the text.
    * @see https://docs.scriptable.app/widgetdate/#-rightaligntext
    */
  /* CompleteClass */
  override def rightAlignText(): Unit = js.native
  
  /**
    * _Color of the shadow._
    *
    * Sets the color of the shadow cast by the text. The `shadowRadius` property must have a value greater than zero for this property to have an effect. Defaults to black.
    * @see https://docs.scriptable.app/widgetdate/#shadowcolor
    */
  /* CompleteClass */
  var shadowColor: typings.scriptableIos.Color = js.native
  
  /**
    * _Offset of the shadow._
    *
    * Sets the offset of the shadow cast by the text. The `shadowRadius` property must have a value greater than zero for this property to have an effect. Defaults to (0, 0).
    * @see https://docs.scriptable.app/widgetdate/#shadowoffset
    */
  /* CompleteClass */
  var shadowOffset: typings.scriptableIos.Point = js.native
  
  /**
    * _Size of the shadow._
    *
    * Sets the size of the shadow cast by the text. Defaults to 0.
    * @see https://docs.scriptable.app/widgetdate/#shadowradius
    */
  /* CompleteClass */
  var shadowRadius: Double = js.native
  
  /**
    * _Color of the text._
    * @see https://docs.scriptable.app/widgetdate/#textcolor
    */
  /* CompleteClass */
  var textColor: typings.scriptableIos.Color = js.native
  
  /**
    * _Opacity of the text._
    *
    * Opacity of the text. This must be a value between 0 and 1. Defaults to 1.
    * @see https://docs.scriptable.app/widgetdate/#textopacity
    */
  /* CompleteClass */
  var textOpacity: Double = js.native
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the text is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * property on the widget.
    * @see https://docs.scriptable.app/widgetdate/#url
    */
  /* CompleteClass */
  var url: String = js.native
}
