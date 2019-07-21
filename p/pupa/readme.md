
# Scala.js typings for pupa

Typings are for version 2.0.0

## Library description:
Simple micro templating

|                    |                 |
| ------------------ | :-------------: |
| Full name          | pupa |
| Keywords           | string, formatting, template, object, format, interpolate, interpolation, templating, str, obj, tpl, expand, simple, replace, placeholders, values, fmt, transform, micro |
| # releases         | 1 |
| # dependents       | 27 |
| # downloads        | 1909344 |
| # stars            | 2 |

## Links
- [Homepage](https://github.com/sindresorhus/pupa#readme)
- [Bugs](https://github.com/sindresorhus/pupa/issues)
- [Repository](https://github.com/sindresorhus/pupa)
- [Npm](https://www.npmjs.com/package/pupa)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Simple micro templating.

@param template - Text with placeholders for `data` properties.
@param data - Data to interpolate into `template`.

@example
```
import pupa = require('pupa');

pupa('The mobile number of {name} is {phone.mobile}', {
	name: 'Sindre',
	phone: {
		mobile: '609 24 363'
	}
});
//=> 'The mobile number of Sindre is 609 24 363'

pupa('I like {0} and {1}', ['🦄', '🐮']);
//=> 'I like 🦄 and 🐮'

// Double braces encodes the HTML entities to avoid code injection
pupa('I like {{0}} and {{1}}', ['<br>🦄</br>', '<i>🐮</i>']);
//=> 'I like &lt;br&gt;🦄&lt;/br&gt; and &lt;i&gt;🐮&lt;/i&gt;'
```
*/

```

