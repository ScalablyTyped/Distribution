package typings.revHash

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rev-hash", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: String): String = js.native
  /**
  Create a hash for file revving.
  @param input - Data to create a hash from.
  @example
  ```
  import * as fs from 'fs';
  import revisionHash = require('rev-hash');
  revisionHash(fs.readFileSync('unicorn.png'));
  //=> 'bb9d8fe615'
  revisionHash('Lorem ipsum dolor sit amet');
  //=> 'fea80f2db0'
  ```
  */
  def apply(input: Buffer): String = js.native
}

