package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextStreamWriter extends TextStreamBase {
  /**
       * Sends a string to an output stream.
       */
  def Write(s: java.lang.String): scala.Unit
  /**
       * Sends a specified number of blank lines (newline characters) to an output stream.
       */
  def WriteBlankLines(intLines: scala.Double): scala.Unit
  /**
       * Sends a string followed by a newline character to an output stream.
       */
  def WriteLine(s: java.lang.String): scala.Unit
}

