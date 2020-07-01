organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20200515Z-fad594"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.4.2-941210",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.10-922a5d",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-af1250",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-d8d037",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-21df12",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.4-e90997",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-ce2a2b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-intl" % "3.12.1-a0093c",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200519Z-ccc96a",
  "org.scalablytyped" %%% "redux" % "4.0.5-86d675",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
